package com.practicaEndava.java2023demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "TicketCategory")
public class TicketCategory implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticketCategoryID")
    private Long ticketCategoryID;

    @ManyToOne
    @JoinColumn(name = "eventID")
    @JsonIgnore
    private Event event;

    @Column(name = "descriptionTicketCategory")
    private String descriptionTicketCategory;

    @Column(name = "price")
    private double price;

    public Long getTicketCategoryID() {
        return ticketCategoryID;
    }

    public void setTicketCategoryID(Long ticketCategoryID) {
        this.ticketCategoryID = ticketCategoryID;
    }

    public Event getEventID() {
        return event;
    }

    public void setEventID(Event eventID) {
        this.event = eventID;
    }

    public String getDescriptionTicketCategory() {
        return descriptionTicketCategory;
    }

    public void setDescriptionTicketCategory(String descriptionTicketCategory) {
        this.descriptionTicketCategory = descriptionTicketCategory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
