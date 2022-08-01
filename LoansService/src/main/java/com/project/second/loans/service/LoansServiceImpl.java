package com.project.second.loans.service;

import com.project.second.loans.entity.Loans;
import com.project.second.loans.repository.LoansRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LoansServiceImpl implements LoansService {

    @Autowired
    private LoansRepository loansRepository;

    @Override
    public List<Loans> getLoansByCustomerId(String customerId) {
        return loansRepository.findByCustomerIdOrderByStartDate(customerId);
    }
}
