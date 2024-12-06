package com.spring.spring_boot.dao;



import com.spring.spring_boot.model.User;

import java.util.List;

public interface UserDao {
    public void addUser(User user);
    public void deleteUser(int id);
    public void updateUser(User user);
    public User getById(int id);
    public List<User> getUsers();
}
