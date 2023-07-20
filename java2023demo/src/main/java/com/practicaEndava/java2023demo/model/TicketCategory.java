package com.practicaEndava.java2023demo.model;

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
    private Event1 event;

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

    public Event1 getEventID() {
        return event;
    }

    public void setEventID(Event1 eventID) {
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
