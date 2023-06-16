package be.coworking.entities;

import be.coworking.entities.enums.Role;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "users")
@NoArgsConstructor
@JsonIgnoreProperties({ "password", "isAccountNonLocked", "isEnabled", "isCredentialsNonExpired",
        "authorities" })
public class User implements UserDetails{

    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String lastname;
    private String email;
    private String password;

    private boolean isEnabled;
    private boolean isCredentialsNonExpired;
    private boolean isAccountNonExpired;
    private boolean isAccountNonLocked;

    @Enumerated(EnumType.STRING)
    private Role role;


    public User(String name, String lastname, String email, String password) {
        super();
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.role = Role.USER;
    }

    public User(String name, String lastname, String email, String password, Role role) {
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        return List.of(new SimpleGrantedAuthority(role.name()));
    }

    @Override
    public String getUsername() {
        return this.email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return this.isAccountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return this.isAccountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return this.isCredentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return this.isEnabled;
    }
}
