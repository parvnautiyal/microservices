package com.project.third.cards.service;

import com.project.third.cards.entity.Cards;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CardsService {
    List<Cards> getCardsByCustomerId(String customerId);
}
