package com.practicaEndava.java2023demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Order1")
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderID")
    private Long orderID;

    @Column(name = "orderedAT")
    private Date orderedAT;

    @ManyToOne
    @JoinColumn(name = "userID")
    @JsonIgnore
    private User user;


    @ManyToOne
    @JoinColumn(name = "ticketCategoryID")
    @JsonIgnore
    private TicketCategory ticketCategoryID;

    @Column(name = "numberOfTickets")
    private int numberOfTickets;

    @Column(name = "totalPrice")
    private double totalPrice;

    public Long getOrderID() {
        return orderID;
    }

    public void setOrderID(Long orderID) {
        this.orderID = orderID;
    }

    public Date getOrderedAT() {
        return orderedAT;
    }

    public void setOrderedAT(Date orderedAT) {
        this.orderedAT = orderedAT;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user1) {
        this.user = user1;
    }

    public TicketCategory getTicketCategoryID() {
        return ticketCategoryID;
    }

    public void setTicketCategoryID(TicketCategory ticketCategoryID) {
        this.ticketCategoryID = ticketCategoryID;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
