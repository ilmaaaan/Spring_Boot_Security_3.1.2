package ru.kata.spring.boot_security.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.kata.spring.boot_security.demo.dao.RoleDao;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.service.UserServiceImp;

@Controller
public class RegistrationController {

    @Autowired
    private UserServiceImp userService;

    @Autowired
    private RoleDao roleDao;

    @GetMapping("/user")
    public String showUser(Model model){
        model.addAttribute("user", new User());
        return "user";
    }

}
