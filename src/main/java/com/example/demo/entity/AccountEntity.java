package com.example.demo.entity;
import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
public class AccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private int account_number;
    @Column
    private String owner_id;
    @Column
    private AccountType account_type;
    @Column
    private double balance;
    @Column 
    private LocalDateTime opened_at;

}
