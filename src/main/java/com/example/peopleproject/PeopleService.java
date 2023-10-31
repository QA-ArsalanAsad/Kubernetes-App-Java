package com.example.peopleproject;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PeopleService {
    
    private final PeopleRepository peopleRepository;

    public PeopleService (PeopleRepository peopleRepository){
        this.peopleRepository = peopleRepository;
    }

    public List<People> getAllPeople() {
        return peopleRepository.findAll();
    }
}
