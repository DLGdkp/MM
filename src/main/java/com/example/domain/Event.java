package com.example.domain;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Event {

    @Id
    @GeneratedValue
    private int eventId;

    @ManyToOne
    private Venue venue;

    private LocalDateTime startTime;
    private LocalDateTime endTime;

    @OneToMany
    private List<Invoice> invoiceList;

    private boolean invoicesComplete;

    @ManyToOne
    private Flyer flyer;


}
