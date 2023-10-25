package com.example.peopleproject;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Table
@Entity
public class People {

    public People(){};

    public People(String firstName, String surName, String email, Integer age) {
        this.firstName = firstName;
        this.surName = surName;
        this.email = email;
        this.age = age;
    }


    @SequenceGenerator(
        name = "people_sequence",
        sequenceName = "people_sequence",
        allocationSize = 1
    )
    @Id
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "people_sequence"
    )

    private Long id;
    private String firstName;
    private String surName;
    private String email;
    private Integer age;
    
}
