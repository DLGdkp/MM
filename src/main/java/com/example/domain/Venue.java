package com.example.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Venue {

    @Id
    @GeneratedValue
    private int venueId;

    @ManyToOne
    private Company company;

    @ManyToMany
    private List<Representative> representatives;

    private String notes;

    @OneToMany
    private List<Event> eventList;

    public Venue(Company company, List<Representative> representatives) {
        this.company = company;
        this.representatives = representatives;
    }

    public Venue() {
    }

    public int getVenueId() {
        return venueId;
    }

    public void setVenueId(int venueId) {
        this.venueId = venueId;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Representative> getRepresentatives() {
        return representatives;
    }

    public void setRepresentatives(List<Representative> representatives) {
        this.representatives = representatives;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
