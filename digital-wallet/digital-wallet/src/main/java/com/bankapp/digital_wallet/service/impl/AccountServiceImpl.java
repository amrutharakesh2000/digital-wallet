package com.bankapp.digital_wallet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.digital_wallet.entity.Account;
import com.bankapp.digital_wallet.entity.User;
import com.bankapp.digital_wallet.repository.AccountRepository;
import com.bankapp.digital_wallet.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
  @Autowired
  private AccountRepository accountRepository;
   
  @Override
  public Account createAccount(User user){
     Account account = new Account();
        account.setUser(user);
        account.setBalance(0.0); // default balance

        return accountRepository.save(account);

    }
@Override
    public Account getAccountByUser(User user) {
        return accountRepository.findByUser(user)
                .orElseThrow(() -> new RuntimeException("Account not found"));
    }
    
    
}
