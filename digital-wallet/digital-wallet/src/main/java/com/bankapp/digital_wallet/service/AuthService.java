package com.bankapp.digital_wallet.service;

import com.bankapp.digital_wallet.dto.request.RegisterRequest;

public interface AuthService {
   String login(String email, String password);
   String registerUser(RegisterRequest request);
}
