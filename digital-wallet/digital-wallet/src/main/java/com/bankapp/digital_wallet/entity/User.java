package com.bankapp.digital_wallet.entity;

import jakarta.persistence.*;
import lombok.*; 

@Entity
@Table(name = "User")
@Getter
@Setter
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String name;
    private String email;
    private String password;
}
