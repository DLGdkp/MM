package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Composition {

    @Id
    @GeneratedValue
    private int compositionId;

    private String title;
    private String Composer;

}
