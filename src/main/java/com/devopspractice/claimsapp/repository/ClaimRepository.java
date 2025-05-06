package com.devopspractice.claimsapp.repository;

import com.devopspractice.claimsapp.model.Claim;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClaimRepository extends JpaRepository<Claim, Long> {
}