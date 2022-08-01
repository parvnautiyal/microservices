package com.project.first.accounts.service;

import com.project.first.accounts.entity.Accounts;
import com.project.first.accounts.repository.AccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountsServiceImpl implements AccountsService{

    @Autowired
    private AccountsRepository accountsRepository;

    @Override
    public Accounts getAccountByCustomerId(String customerId){
        return accountsRepository.findByCustomerId(customerId);
    }
}
