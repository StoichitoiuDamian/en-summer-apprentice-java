package com.practicaEndava.java2023demo.model;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Venue")
public class Venue implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "venueID")
    private Long venueID;

    @Column(name = "venueLocation")
    private String venueLocation;
    @Column(name = "venueType")
    private String venueType;
    @Column(name = "venueCapacity")
    private int venueCapacity;

    @OneToMany(mappedBy = "venue")
    private List<Event1> events;


    public Long getVenueID() {
        return venueID;
    }

    public void setVenueID(Long venueID) {
        this.venueID = venueID;
    }

    public String getVenueLocation() {
        return venueLocation;
    }

    public void setVenueLocation(String venueLocation) {
        this.venueLocation = venueLocation;
    }

    public String getVenueType() {
        return venueType;
    }

    public void setVenueType(String venueType) {
        this.venueType = venueType;
    }

    public int getVenueCapacity() {
        return venueCapacity;
    }

    public void setVenueCapacity(int venueCapacity) {
        this.venueCapacity = venueCapacity;
    }

    public List<Event1> getEvents() {
        return events;
    }

    public void setEvents(List<Event1> events) {
        this.events = events;
    }
}
