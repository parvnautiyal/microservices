package com.project.third.cards.entity;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CustomerDto {
    private String id;
    private String name;
    private String email;
    private String mobile;
    private LocalDate createDate;
}
