package com.project.third.cards.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "cards")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cards {
    @Id
    private String id;
    private String customerId;
    private String cardNumber;
    private String cardType;
    private long limit;
    private long amountUsed;
    private long availableAmount;
    private LocalDate createDate;

}
