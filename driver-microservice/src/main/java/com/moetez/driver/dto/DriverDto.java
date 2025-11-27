package com.moetez.driver.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DriverDto {
    private Long id;

    private String fullName;
    private String equipe;
    private int age;
    private String champId;
    private String champName;

}


