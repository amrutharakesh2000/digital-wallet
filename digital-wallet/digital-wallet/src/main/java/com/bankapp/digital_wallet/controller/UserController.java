package com.bankapp.digital_wallet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankapp.digital_wallet.entity.User;
import com.bankapp.digital_wallet.service.UserService;

@RestController
@RequestMapping("api/user")
public class UserController {
    
    @Autowired
    private UserService userService;

    //CREATE USER
    @PostMapping
    public User creatUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    //Get all user 
    @GetMapping
    public List<User> getAllUser(){
        return userService.getAllUsers();
    }

}
