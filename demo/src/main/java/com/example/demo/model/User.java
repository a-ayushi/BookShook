package com.example.demo.model;

import javax.annotation.processing.Generated;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // private int id;
    private String name;
    private String email;

    // Constructer (default)
    public User() {
    }

    // contructer with fields
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getter for Name
    public String getName() {
        return name;
    }

    // Setter for Name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for Email
    public String getEmail() {
        return email;
    }

    // Setter for Email
    public void setEmail(String email) {
        this.email = email;
    }

}
