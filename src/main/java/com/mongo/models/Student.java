package com.mongo.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document
public class Student {
    @Id
    private String id;
    private String firstName;
    private String lastname;
    private Gender gender ;
    private Address address;
    private int age;
    private LocalDateTime createdAt;

    public Student(String firstName,
                   String lastname,
                   Gender gender,
                   Address address,
                   int age,
                   LocalDateTime createdAt) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.gender = gender;
        this.address = address;
        this.age = age;
        this.createdAt = createdAt;
    }
}
