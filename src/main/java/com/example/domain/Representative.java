package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Representative extends Person{

    @ManyToMany
    private List<Venue> venue;

    private String notes;


    public Representative(List<Venue> venue, String notes) {
        this.venue = venue;
        this.notes = notes;
    }

    public Representative() {
    }

    public List<Venue> getVenue() {
        return venue;
    }

    public void setVenue(List<Venue> venue) {
        this.venue = venue;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
