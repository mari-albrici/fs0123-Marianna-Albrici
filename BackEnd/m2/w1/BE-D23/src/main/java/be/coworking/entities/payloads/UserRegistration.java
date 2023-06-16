package be.coworking.entities.payloads;

import be.coworking.entities.enums.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserRegistration {
        @NotNull(message = "Il nome è obbligatorio")
        @Size(min = 3, max = 30, message = "Nome min 3 caratteri, massimo 30")
        String name;
        @NotNull(message = "Il cognome è obbligatorio")
        String lastname;
        @Email(message = "Non hai inserito un indirizzo email valido")
        String email;
        @NotNull(message = "La password è obbligatoria")
        String password;
        Role role;
}
