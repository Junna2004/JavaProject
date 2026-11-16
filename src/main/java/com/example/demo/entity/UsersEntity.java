package com.example.demo.entity;

import jakarta.persistence.*;

@Entity 

public class UsersEntity {
    @Id 
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @Column(name="username")
    private String userName;
    @Column 
    private String password;
    @Column
    private String fullName;

    @Enumerated(EnumType.STRING)
    private Role role;

    
}
