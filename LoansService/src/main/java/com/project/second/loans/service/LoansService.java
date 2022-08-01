package com.project.second.loans.service;

import com.project.second.loans.entity.Loans;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LoansService {
    List<Loans> getLoansByCustomerId(String customerId);
}
