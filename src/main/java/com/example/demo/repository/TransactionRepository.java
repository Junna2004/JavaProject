package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.TransactionsEntity;

public interface TransactionRepository extends JpaRepository<TransactionsEntity,Integer>{

    
} 
