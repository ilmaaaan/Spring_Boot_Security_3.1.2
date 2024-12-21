package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;
import java.util.Set;

public interface UserService extends UserDetailsService {

    public void save(User user);

    public UserDetails loadUserByUsername(String username);

    public User getById(Long id);

    public User findByName(String name);

    public List<User> getUsers();

    public void updateUser(User user);

    public void deleteUser(Long id);

    public Set<Role> getRoles();
}
