package com.project.third.cards.service;

import com.project.third.cards.entity.Cards;
import com.project.third.cards.repository.CardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CardsServiceImpl implements CardsService{

    @Autowired
    private CardsRepository cardsRepository;

    @Override
    public List<Cards> getCardsByCustomerId(String customerId) {
        return cardsRepository.findByCustomerIdOrderByLimit(customerId);
    }
}
