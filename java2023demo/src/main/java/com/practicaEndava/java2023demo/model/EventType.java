package com.practicaEndava.java2023demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "EventType")
public class EventType implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eventTypeID")
    private Long eventTypeID;

    @Column(name = "eventTypeName")
    private String eventTypeName;

    @OneToMany(mappedBy = "eventTypeID")
    @JsonIgnore
    private List<Event> events;

    public Long getEventTypeID() {
        return eventTypeID;
    }

    public void setEventTypeID(Long eventTypeID) {
        this.eventTypeID = eventTypeID;
    }

    public String getEventTypeName() {
        return eventTypeName;
    }

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
}

