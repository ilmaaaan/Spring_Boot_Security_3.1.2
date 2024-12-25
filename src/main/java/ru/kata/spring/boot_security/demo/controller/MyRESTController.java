package ru.kata.spring.boot_security.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.service.UserService;

import java.util.List;
import java.util.Set;


@RestController
@RequestMapping("/api/users")
public class MyRESTController {

    private final UserService userService;

    @Autowired
    public MyRESTController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public List<User> printUsers() {
        List<User> users = userService.getUsers();
        return users;
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") Long id) {
        User user = userService.getById(id);
        return user;
    }

    @PostMapping()
    public User saveUser(@RequestBody User user) {
        userService.save(user);
        return user;
    }

    @PutMapping()
    public User editUser(@RequestBody User user) {
        userService.updateUser(user);
        return user;
    }

    @DeleteMapping()
    public String deleteUser(@RequestParam("id") Long id) {
        userService.deleteUser(id);
        return "User with id = " + id + " was deleted";
    }

    @GetMapping("/roles")
    public Set<Role> getRoles() {
        return userService.getRoles();
    }
}
