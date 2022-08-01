package com.project.first.accounts.service;

import com.project.first.accounts.entity.Accounts;
import org.springframework.stereotype.Service;

@Service
public interface AccountsService {
    Accounts getAccountByCustomerId(String customerId);
}
