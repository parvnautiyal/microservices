package com.project.second.loans.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "loans")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Loans {
    @Id
    private String id;
    private String customerId;
    private LocalDate startDate;
    private String loanType;
    private long amount;
    private long amountPaid;
    private long outstandingAmount;
    private LocalDate createDate;
}
