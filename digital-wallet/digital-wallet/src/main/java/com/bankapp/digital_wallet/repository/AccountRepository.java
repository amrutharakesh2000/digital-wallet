package com.bankapp.digital_wallet.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankapp.digital_wallet.entity.Account;
import com.bankapp.digital_wallet.entity.User;
public interface AccountRepository extends JpaRepository<Account, Long> {
     Optional<Account> findByUser(User user);
    
}
