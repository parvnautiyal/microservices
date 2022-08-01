package com.project.second.loans.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonPropertyOrder({ "id", "customerId", "createDate", "startDate", "loanType", "amount", "amountPaid",
        "outstandingAmount" })
public class LoansDto {
    @JsonProperty("loanNumber")
    private String id;
    private String customerId;
    private LocalDate startDate;
    private String loanType;
    private long amount;
    private long amountPaid;
    private long outstandingAmount;
    private LocalDate createDate;
}
