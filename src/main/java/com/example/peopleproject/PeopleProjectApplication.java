package com.example.peopleproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class PeopleProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PeopleProjectApplication.class, args);
	}

	@GetMapping
	public String getMessage(){
		return "Hello World!";
	}

}
