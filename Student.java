package com.university.model;

import jakarta.persistence.*;

// Mark the class as a JPA entity, which maps it to a database table
@Entity
public class Student {
    
    // The 'id' field will be the primary key for this table
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Fields for the Student entity
    private String name;
    private String email;
    private String registrationNumber;

    // Default constructor
    public Student() {
    }

    // Parameterized constructor
    public Student(String name, String email, String registrationNumber) {
        this.name = name;
        this.email = email;
        this.registrationNumber = registrationNumber;
    }

    // Getters and Setters for each field
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}

