package com.bankapp.digital_wallet.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.bankapp.digital_wallet.entity.User;
import com.bankapp.digital_wallet.repository.UserRepository;
import com.bankapp.digital_wallet.service.UserService;

@Service
public class UserServiceimpl implements UserService {
@Autowired
private UserRepository userRepository;

 @Autowired
 private PasswordEncoder passwordEncoder;

@Override
public User saveUser(User user){
   user.setPassword(passwordEncoder.encode(user.getPassword()));
   return userRepository.save(user);
}

@Override
public List<User> getAllUsers(){
   return userRepository.findAll();
}

}
