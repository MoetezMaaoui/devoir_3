package com.moetez.championnat.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChampionnatDto {
    private Long id;
    private String nom;
    private String annee;
}