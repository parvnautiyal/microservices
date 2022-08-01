package com.project.third.cards.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.project.third.cards.entity.CardsDto;
import com.project.third.cards.entity.CustomerDto;
import com.project.third.cards.entity.Properties;
import com.project.third.cards.properties.CardsServiceConfig;
import com.project.third.cards.service.CardsService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1.0/cards")
public class CardsController {

    @Autowired
    private CardsService cardsService;
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private CardsServiceConfig cardsConfig;

    @PostMapping("/myCards")
    public ResponseEntity<List<CardsDto>> getCardsByCustomerId(@RequestBody CustomerDto customer) {
        try {
            return new ResponseEntity<>(cardsService.getCardsByCustomerId(customer.getId()).stream()
                    .map(cards -> modelMapper.map(cards, CardsDto.class))
                    .toList(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/properties")
    public String getPropertyDetails() throws JsonProcessingException {
        ObjectWriter objectWriter = new ObjectMapper().writer().withDefaultPrettyPrinter();
        Properties properties = new Properties(cardsConfig.getMsg(), cardsConfig.getBuildVersion());
        return objectWriter.writeValueAsString(properties);
    }
}
