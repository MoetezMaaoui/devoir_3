package com.moetez.driver.service;

import com.moetez.driver.dto.ChampionnatDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(url = "http://localhost:8888", value = "CHAMPIONNAT-MICROSERVICE")
@FeignClient(name = "CHAMPIONNAT-MICROSERVICE")
public interface APIDriver {
    @GetMapping("/api/championnats/nom/{nom}")
    ChampionnatDto getChampionnatByNom(@PathVariable("nom") String nom);
}

