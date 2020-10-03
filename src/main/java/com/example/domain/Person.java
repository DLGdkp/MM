package com.example.domain;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Person {

    @Id
    @GeneratedValue
    private int personId;

    private String surName;
    private String inserts;
    private String lastName;
    private String email;
    private String phone;
    private String username;
    private String password;

    public Person(String surName, String inserts, String lastName, String email, String phone, String username, String password) {
        this.personId = personId;
        this.surName = surName;
        this.inserts = inserts;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.username = username;
        this.password = password;
    }

    public Person() {
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getInserts() {
        return inserts;
    }

    public void setInserts(String inserts) {
        this.inserts = inserts;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
