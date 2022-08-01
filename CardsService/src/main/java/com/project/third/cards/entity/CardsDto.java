package com.project.third.cards.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonPropertyOrder({"id","customerId","cardNumber","cardType","createDate","limit","amountUsed","availableAmount"})
public class CardsDto {
    @JsonProperty("cardId")
    private String id;
    private String customerId;
    private String cardNumber;
    private String cardType;
    private long limit;
    private long amountUsed;
    private long availableAmount;
    private LocalDate createDate;
}
