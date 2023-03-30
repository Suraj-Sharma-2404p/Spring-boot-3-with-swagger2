package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User createUser(User user);
    Optional<User> getByUserId(int userId);
    List<User> getAllUsers();

    void deleteUserById(int userId);
}
