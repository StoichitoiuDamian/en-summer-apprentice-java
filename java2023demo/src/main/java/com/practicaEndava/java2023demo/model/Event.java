package com.practicaEndava.java2023demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Event1")
public class Event implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eventID")
    private Long eventID;

    @ManyToOne
    @JoinColumn(name = "venueID")
    @JsonIgnore
    private Venue venue;

    @ManyToOne
    @JoinColumn(name = "eventTypeID")
    @JsonIgnore
    private EventType eventTypeID;

    @Column(name = "eventName")
    private String eventName;

    @Column(name = "descriptionEvent")
    private String descriptionEvent;

    @Column(name = "startDate")
    private Date startDate;

    @Column(name = "endDate")
    private Date endDate;

    @OneToMany(mappedBy = "event")
    @JsonIgnore
    private List<TicketCategory> ticketCategories;

    public Long getEventID() {
        return eventID;
    }

    public void setEventID(Long eventID) {
        this.eventID = eventID;
    }

    public Venue getVenueID() {
        return venue;
    }

    public void setVenueID(Venue venueID) {
        this.venue = venueID;
    }

    public EventType getEventTypeID() {
        return eventTypeID;
    }

    public void setEventTypeID(EventType eventTypeID) {
        this.eventTypeID = eventTypeID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getDescriptionEvent() {
        return descriptionEvent;
    }

    public void setDescriptionEvent(String descriptionEvent) {
        this.descriptionEvent = descriptionEvent;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<TicketCategory> getTicketCategories() {
        return ticketCategories;
    }

    public void setTicketCategories(List<TicketCategory> ticketCategories) {
        this.ticketCategories = ticketCategories;
    }
}
