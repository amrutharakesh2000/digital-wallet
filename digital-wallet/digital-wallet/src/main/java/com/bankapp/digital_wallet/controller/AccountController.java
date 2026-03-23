package com.bankapp.digital_wallet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankapp.digital_wallet.entity.Account;
import com.bankapp.digital_wallet.entity.User;
import com.bankapp.digital_wallet.repository.UserRepository;
import com.bankapp.digital_wallet.service.AccountService;

@RestController
@RequestMapping("/api/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private UserRepository userRepository;

    // GET ACCOUNT BY USER EMAIL
    @GetMapping("/{email}")
    public Account getAccount(@PathVariable String email) {

        // 1. Find user
        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("User not found"));

        // 2. Get account
        return accountService.getAccountByUser(user);
    }
}