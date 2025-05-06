package com.devopspractice.claimsapp.controller;

import com.devopspractice.claimsapp.model.Claim;
import com.devopspractice.claimsapp.service.ClaimService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/claims")
public class ClaimController {
    private final ClaimService claimService;

    public ClaimController(ClaimService claimService) {
        this.claimService = claimService;
    }

    @PostMapping
    public Claim create(@RequestBody Claim claim) {
        return claimService.createClaim(claim);
    }

    @GetMapping
    public List<Claim> getAll() {
        return claimService.getAllClaims();
    }

    @GetMapping("/{id}")
    public Claim getById(@PathVariable Long id) {
        return claimService.getClaimById(id);
    }
}