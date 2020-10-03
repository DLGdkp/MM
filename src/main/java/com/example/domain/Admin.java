package com.example.domain;

import javax.persistence.Entity;

@Entity
public class Admin extends Person {

    public Admin(String surName, String inserts, String lastName, String email, String phone, String username, String password) {
        super(surName, inserts, lastName, email, phone, username, password);
    }

    public Admin() {
    }
}
