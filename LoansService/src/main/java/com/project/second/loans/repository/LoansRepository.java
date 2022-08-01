package com.project.second.loans.repository;

import com.project.second.loans.entity.Loans;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoansRepository extends MongoRepository<Loans, String> {
    List<Loans> findByCustomerIdOrderByStartDate(String customerId);
}
