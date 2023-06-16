package be.coworking.services;

import be.coworking.entities.User;
import be.coworking.entities.payloads.UserRegistration;
import be.coworking.exceptions.BadRequest;
import be.coworking.exceptions.NotFound;
import be.coworking.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepo;

    public User create(UserRegistration u){
        userRepo.findByEmail(u.getEmail()).ifPresent(user -> {
            throw new BadRequest("Email " + user.getEmail() + " already in use!");
        });
        User newUser = new User(u.getName(), u.getLastname(), u.getEmail(), u.getPassword(), u.getRole());
        return userRepo.save(newUser);
    }

    public List<User> find(int page){
        Pageable pageable = PageRequest.of(page, 10);
        return userRepo.findAll();
    }

    public User findById(UUID id) throws NotFound{
        return userRepo.findById(id).orElseThrow(() -> new NotFound("User not found"));
    }

    public User findByIdAndUpdate(UUID id, User u) throws NotFound {
        User found = this.findById(id);

        found.setId(id);
        found.setName(u.getName());
        found.setLastname(u.getLastname());
        found.setEmail(u.getEmail());

        return userRepo.save(found);
    }

    public void findByIdAndDelete(UUID id) throws NotFound{
        User found = this.findById(id);
        userRepo.delete(found);
    }

    public User findByEmail(String email) throws NotFound {
        return userRepo.findByEmail(email).orElseThrow(() -> new NotFound("Email not found"));
    }

    public User create(User user) {
        return userRepo.save(user);
    }
}
