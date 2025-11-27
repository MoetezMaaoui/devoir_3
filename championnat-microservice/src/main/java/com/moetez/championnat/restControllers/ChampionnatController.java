package com.moetez.championnat.restControllers;

import com.moetez.championnat.config.Configuration;
import com.moetez.championnat.dto.ChampionnatDto;
import com.moetez.championnat.service.CampionnatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;


@RestController
@RequestMapping("/api/championnats")
//@AllArgsConstructor
public class ChampionnatController {

    private CampionnatService championnatService;

    @Value("${build.version}")
    private String buildVersion;

    @Autowired
    Configuration configuration;

    public ChampionnatController(CampionnatService championnatService){
        this.championnatService = championnatService;
    }

    @GetMapping("/nom/{nom}")
    public ResponseEntity<ChampionnatDto> getChampionnatByNom(@PathVariable("nom") String nom) {
        return new ResponseEntity<ChampionnatDto>(
                championnatService.getChampionnatByNom(nom),
                HttpStatus.OK
        );
    }

    @GetMapping("/version")
    public ResponseEntity<String> version()
    {
        return ResponseEntity.status(HttpStatus.OK).body(buildVersion);
    }

    @GetMapping("/author")
    public ResponseEntity<String> retrieveAuthorInfo() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(configuration.getName()+" "+configuration.getEmail() );
    }

}