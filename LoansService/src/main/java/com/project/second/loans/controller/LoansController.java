package com.project.second.loans.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.project.second.loans.entity.CustomerDto;
import com.project.second.loans.entity.LoansDto;
import com.project.second.loans.entity.Properties;
import com.project.second.loans.properties.LoansServiceConfig;
import com.project.second.loans.service.LoansService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1.0/loans")
public class LoansController {

    @Autowired
    private LoansService loansService;
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private LoansServiceConfig loansConfig;

    @PostMapping("/myLoans")
    public ResponseEntity<List<LoansDto>> getLoansByCustomerId(@RequestBody CustomerDto customer) {
        try {
            return new ResponseEntity<>(loansService.getLoansByCustomerId(customer.getId()).stream()
                    .map(loans -> modelMapper.map(loans, LoansDto.class)).toList(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/properties")
    public String getPropertyDetails() throws JsonProcessingException {
        ObjectWriter objectWriter = new ObjectMapper().writer().withDefaultPrettyPrinter();
        Properties properties = new Properties(loansConfig.getMsg(), loansConfig.getBuildVersion());
        return objectWriter.writeValueAsString(properties);
    }
}
