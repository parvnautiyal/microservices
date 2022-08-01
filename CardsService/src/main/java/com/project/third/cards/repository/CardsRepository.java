package com.project.third.cards.repository;

import com.project.third.cards.entity.Cards;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardsRepository extends MongoRepository<Cards,String> {
    List<Cards> findByCustomerIdOrderByLimit(String customerId);
}
