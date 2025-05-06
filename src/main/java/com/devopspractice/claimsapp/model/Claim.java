package com.devopspractice.claimsapp.model;

import jakarta.persistence.*;

@Entity
public class Claim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String memberName;
    private String claimType;
    private double amount;

    // Getters and Setters
}