package com.project.first.accounts.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.project.first.accounts.entity.AccountsDto;
import com.project.first.accounts.entity.CustomerDto;
import com.project.first.accounts.entity.Properties;
import com.project.first.accounts.properties.AccountsServiceConfig;
import com.project.first.accounts.service.AccountsService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1.0/accounts")
public class AccountsController {

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private AccountsService accountsService;

    @Autowired
    private AccountsServiceConfig accountsConfig;

    @PostMapping("/myAccount")
    public ResponseEntity<AccountsDto> getAccounts(@RequestBody CustomerDto customer){
        try{
            return new ResponseEntity<>(modelMapper.map(accountsService.getAccountByCustomerId(customer.getId()),AccountsDto.class),HttpStatus.OK);
        } catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/properties")
    public String getPropertyDetails() throws JsonProcessingException {
        ObjectWriter objectWriter = new ObjectMapper().writer().withDefaultPrettyPrinter();
        Properties properties = new Properties(accountsConfig.getMsg(), accountsConfig.getBuildVersion());
        return objectWriter.writeValueAsString(properties);
    }

}
