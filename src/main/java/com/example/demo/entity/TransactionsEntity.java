package com.example.demo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
public class TransactionsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String account_id;
    @Column
    private TransactionType type;
    @Column
    private Double amount;
    @Column
    private Double balance_after;
    @Column
    private String note;
    @Column
    private LocalDateTime timestamp;

}
