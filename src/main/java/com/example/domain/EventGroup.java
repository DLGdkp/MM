package com.example.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class EventGroup {

    @Id
    @GeneratedValue
    private int eventGroupId;
    @OneToOne
    private Artist leadArtist;
    @OneToMany
    private List<Artist> artistList;
    private String title;
    private String description;
    @OneToMany
    private List<Composition> program;
    @OneToMany
    private List<Event> events;


    public EventGroup(Artist leadArtist, List<Event> events) {
        this.leadArtist = leadArtist;
        this.events = events;
    }

    public EventGroup() {
    }

    public int getEventGroupId() {
        return eventGroupId;
    }

    public void setEventGroupId(int eventGroupId) {
        this.eventGroupId = eventGroupId;
    }

    public Artist getLeadArtist() {
        return leadArtist;
    }

    public void setLeadArtist(Artist leadArtist) {
        this.leadArtist = leadArtist;
    }

    public List<Artist> getArtistList() {
        return artistList;
    }

    public void setArtistList(List<Artist> artistList) {
        this.artistList = artistList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Composition> getProgram() {
        return program;
    }

    public void setProgram(List<Composition> program) {
        this.program = program;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
}
