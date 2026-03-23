package com.bankapp.digital_wallet.service;

import java.util.List;

import com.bankapp.digital_wallet.entity.User;


public interface UserService {
    User saveUser(User user);
    List<User> getAllUsers();
}