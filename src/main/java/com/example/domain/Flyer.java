package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Flyer {

    @Id
    @GeneratedValue
    private int flyerId;

    public Flyer() {
    }
}
