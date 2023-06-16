package be.coworking.runners;

import be.coworking.entities.User;
import be.coworking.entities.enums.Role;
import be.coworking.entities.payloads.UserRegistration;
import be.coworking.services.UserService;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Locale;
@Component
public class UserRunner implements CommandLineRunner {

    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder bcrypt;
    @Override
    public void run(String... args){

        Faker faker = new Faker(new Locale("it"));

        for (int i = 0; i < 50; i++)
            try {
                User user = new User();
                String password = bcrypt.encode(faker.internet().password());
                user.setName(faker.name().firstName());
                user.setLastname(faker.name().lastName());
                user.setEmail(faker.internet().emailAddress());
                user.setPassword(password);
                user.setRole(Role.USER);
//                userService.create(user);
            } catch (Exception e) {
                System.out.println(e);
            }

    }

}
