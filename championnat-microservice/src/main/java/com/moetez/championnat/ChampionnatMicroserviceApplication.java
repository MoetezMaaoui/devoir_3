package com.moetez.championnat;

import com.moetez.championnat.entities.Championnat;
import com.moetez.championnat.repos.ChampionnatRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ChampionnatMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChampionnatMicroserviceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ChampionnatRepository championnatRepository) {
        return args -> {
            championnatRepository.save(Championnat.builder()
                    .nom("f1")
                    .annee("1950")
                    .build());
            championnatRepository.save(Championnat.builder()
                    .nom("f2")
                    .annee("2017")
                    .build());
        };
    }
}
