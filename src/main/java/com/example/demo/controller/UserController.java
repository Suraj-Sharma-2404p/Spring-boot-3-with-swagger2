package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/createUser")
    public ResponseEntity<User> createUser(@RequestBody User user){
        return ResponseEntity.ok(userService.createUser(user));
    }

    @GetMapping
    private List<User> getAllUser(){
        List<User> userList = userService.getAllUsers();
        return userList;
    }
    @GetMapping("/{userId}")
    private ResponseEntity<User> getUserById(@PathVariable Integer userId){
        return ResponseEntity.ok().body(userService.getByUserId(userId).get());
    }

    @DeleteMapping("/{userId}")
    private ResponseEntity<String> deleteByID(@PathVariable Integer userId){
        userService.deleteUserById(userId);
        return ResponseEntity.ok().body("User deleted successfully!!");
    }
}
