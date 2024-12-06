//package ru.kata.spring.boot_security.demo.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import ru.kata.spring.boot_security.demo.model.User;
//import ru.kata.spring.boot_security.demo.service.UserServiceImp;
//
//import java.util.List;
//
//@Controller
//public class UserController {
//
//    @Autowired
//    private UserServiceImp userService;
//
//    @GetMapping(value = "/")
//    public String printUsers(Model model) {
//        List<User> users = userService.getUsers();
//        model.addAttribute("users", users);
//        return "admin";
//    }
//
//    @GetMapping(value = "/new")
//    public String getUserForm(Model model) {
//        model.addAttribute("user", new User());
//        return "registration";
//    }
//
//    @GetMapping(value = "/show")
//    public String getById(Model model, @RequestParam("id") Long id) {
//        model.addAttribute("user", userService.getById(id));
//        return "show";
//    }
//
//    @PostMapping()
//    public String saveUser(@ModelAttribute("user") User user) {
//        userService.saveUser(user);
//        return "redirect:/";
//    }
//
//    @GetMapping(value = "/edit")
//    public String updateUser(@RequestParam("id") Long id, Model model) {
//        model.addAttribute("user", userService.getById(id));
//        return "edit";
//    }
//
//    @PatchMapping(value = "/")
//    public String editUser(@ModelAttribute("user") User user, @RequestParam("id") Long id) {
//        userService.updateUser(user);
//        return "redirect:/";
//    }
//
//    @DeleteMapping(value = "/")
//    public String deleteUser(@RequestParam("id") Long id) {
//        userService.deleteUser(id);
//        return "redirect:/";
//    }
//}
