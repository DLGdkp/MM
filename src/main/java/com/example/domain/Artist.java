package com.example.domain;

import javax.persistence.*;
import java.io.File;

@Entity
public class Artist extends Person {

    private String instrument;
    private File portret;
    private boolean signedContract;
    @OneToOne
    private Company company;
    private String notes;

    public Artist(String surName, String inserts, String lastName, String email, String phone, String username, String password, String instrument, File portret, boolean signedContract, Company company, String notes) {
        super(surName, inserts, lastName, email, phone, username, password);
        this.instrument = instrument;
        this.portret = portret;
        this.signedContract = signedContract;
        this.company = company;
        this.notes = notes;
    }

    public Artist() {
        super();
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public File getPortret() {
        return portret;
    }

    public void setPortret(File portret) {
        this.portret = portret;
    }

    public boolean isSignedContract() {
        return signedContract;
    }

    public void setSignedContract(boolean signedContract) {
        this.signedContract = signedContract;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
