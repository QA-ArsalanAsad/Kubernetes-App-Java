package com.example.peopleproject;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "people")
public class PeopleController {
    
    private final PeopleService peopleService;

    public PeopleController(PeopleService peopleService){
        this.peopleService = peopleService;
    }

    @GetMapping()
    public List<People> getAllPeople(){
        return peopleService.getAllPeople();
    }
}
