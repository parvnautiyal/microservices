package com.project.first.accounts.entity;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class AccountsDto {
    @JsonProperty("accountNumber")
    private String id;
    private String customerId;
    private String accountType;
    private String branchAddress;
    private LocalDate createDate;
}
