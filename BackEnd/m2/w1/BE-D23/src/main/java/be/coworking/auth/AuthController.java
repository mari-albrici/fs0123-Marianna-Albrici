package be.coworking.auth;

import be.coworking.auth.payload.AuthenticationSuccessfull;
import be.coworking.entities.User;
import be.coworking.entities.payloads.UserLogin;
import be.coworking.entities.payloads.UserRegistration;
import be.coworking.exceptions.NotFound;
import be.coworking.exceptions.Unauthorized;
import be.coworking.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin
public class AuthController {

    @Autowired
    UserService userService;

    @Autowired
    private PasswordEncoder bcrypt;


    @PostMapping("/signup")
    public ResponseEntity<User> register(@RequestBody @Validated UserRegistration body){

        body.setPassword(bcrypt.encode(body.getPassword()));

        User createdUser = userService.create(body);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<AuthenticationSuccessfull> login(@RequestBody UserLogin body)
            throws NotFound {

        User user = userService.findByEmail(body.getEmail());

        String plainPW = body.getPassword();
        String hashedPW = user.getPassword();

        if (!bcrypt.matches(plainPW, hashedPW))
            throw new Unauthorized("Credenziali non valide");

        String token = JWTTools.createToken(user);

        return new ResponseEntity<>(new AuthenticationSuccessfull(token), HttpStatus.OK);
        }


    }

