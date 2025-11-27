package com.moetez.driver;

import com.moetez.driver.entities.Driver;
import com.moetez.driver.repos.DriverRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableFeignClients
public class DriverMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DriverMicroserviceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(DriverRepository driverRepository) {
        return args -> {
            driverRepository.save(Driver.builder()
                    .fullName("max verstappen")
                    .equipe("Red Bull")
                    .age(28)
                    .champId("f1")
                    .build());
            driverRepository.save(Driver.builder()
                    .fullName("hamilton lewis")
                    .equipe("Ferrari")
                    .age(40)
                    .champId("f1")
                    .build());
        };
    }

    @Bean
    public WebClient webClient(){
        return WebClient.builder().build();
    }


}
