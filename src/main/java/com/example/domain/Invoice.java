package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.File;

@Entity
public class Invoice {

    @Id
    @GeneratedValue
    private int invoiceId;

    @ManyToOne
    private Artist artist;
    @ManyToOne
    private Venue venue;
    @ManyToOne
    private Event event;
    private String invoiceNumber;
    private String serviceDescription;
    private File invoiceFile;

    public Invoice(int invoiceId, Artist artist, Venue venue, Event event, String invoiceNumber, String serviceDescription, File invoiceFile) {
        this.invoiceId = invoiceId;
        this.artist = artist;
        this.venue = venue;
        this.event = event;
        this.invoiceNumber = invoiceNumber;
        this.serviceDescription = serviceDescription;
        this.invoiceFile = invoiceFile;
    }

    public Invoice() {
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public File getInvoiceFile() {
        return invoiceFile;
    }

    public void setInvoiceFile(File invoiceFile) {
        this.invoiceFile = invoiceFile;
    }
}
