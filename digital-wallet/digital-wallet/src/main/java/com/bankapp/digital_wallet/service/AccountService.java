package com.bankapp.digital_wallet.service;

import com.bankapp.digital_wallet.entity.Account;
import com.bankapp.digital_wallet.entity.User;

public interface AccountService {
     Account createAccount(User user);
     Account getAccountByUser(User user);
}
