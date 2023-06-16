package be.coworking.controllers;

import be.coworking.entities.User;
import be.coworking.entities.payloads.UserRegistration;
import be.coworking.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UserService userService;

    @GetMapping("")
    public List<User> getUsers(@RequestParam(defaultValue = "0") int page){
        return userService.find(page);
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public User saveUser(@RequestBody UserRegistration body) {
        return userService.create(body);
    }

    @GetMapping("/{userId}")
    public User getUser(@PathVariable UUID userId) throws Exception {
        return userService.findById(userId);
    }

    @PutMapping("/{userId}")
    public User updateUser(@PathVariable UUID userId, @RequestBody User body) throws Exception {
        return userService.findByIdAndUpdate(userId, body);
    }

    @DeleteMapping("/{userId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable UUID userId) throws Exception {
        userService.findByIdAndDelete(userId);
    }

//    @PatchMapping("/{userId}")
//    public User patchUser(@PathVariable UUID userId, @RequestBody User body) throws Exception {
//        return userService.findByIdAndUpdate(userId, body);
//    }
}
