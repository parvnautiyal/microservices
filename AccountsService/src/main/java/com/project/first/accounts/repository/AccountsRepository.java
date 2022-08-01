package com.project.first.accounts.repository;

import com.project.first.accounts.entity.Accounts;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepository extends MongoRepository<Accounts,String> {

    Accounts findByCustomerId(String customerId);
}
