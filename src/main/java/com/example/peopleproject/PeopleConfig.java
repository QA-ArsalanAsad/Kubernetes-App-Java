package com.example.peopleproject;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PeopleConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(PeopleRepository repository){

        return args -> {
            People jay = new People(
                1L,
                "Jay",
                "Garcia",
                "jaygarcia@gmail.com",
                25
            );
            People roger = new People(
                "Gol.d",
                "Roger",
                "gol.d.roger@gmail.com",
                30
            );

            repository.saveAll(
                List.of(jay, roger)
            );
        };
    }

}
