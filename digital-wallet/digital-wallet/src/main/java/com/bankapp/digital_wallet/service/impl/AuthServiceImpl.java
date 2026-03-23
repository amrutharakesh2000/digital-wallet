package com.bankapp.digital_wallet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.bankapp.digital_wallet.dto.request.RegisterRequest;
import com.bankapp.digital_wallet.entity.User;
import com.bankapp.digital_wallet.repository.UserRepository;
import com.bankapp.digital_wallet.security.JwtUtil;
import com.bankapp.digital_wallet.service.AccountService;
import com.bankapp.digital_wallet.service.AuthService;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AccountService accountService;

    @Autowired
    private JwtUtil jwtUtil;

    // ✅ REGISTER USER
    @Override
    public String registerUser(RegisterRequest request) {

        // Create user
        User user = new User();
        user.setName(request.getName());
        user.setEmail(request.getEmail());

        // 🔥 VERY IMPORTANT: HASH PASSWORD
        user.setPassword(passwordEncoder.encode(request.getPassword()));

        // Save user
        User savedUser = userRepository.save(user);

        // Create account
        accountService.createAccount(savedUser);

        return "User registered successfully";
    }

    // ✅ LOGIN USER
    @Override
    public String login(String email, String password) {

        // Find user
        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("User not found"));

        // 🔥 IMPORTANT: MATCH HASHED PASSWORD
        boolean isMatch = passwordEncoder.matches(password, user.getPassword());

        if (!isMatch) {
            throw new RuntimeException("Invalid password");
        }
        return jwtUtil.generateToken(email);
    }
}