package com.practicaEndava.java2023demo.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Order1")
public class Order1 implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderID")
    private Long orderID;

    @Column(name = "orderedAT")
    private Date orderedAT;

    @ManyToOne
    @JoinColumn(name = "userID")
    private User1 user;


    @ManyToOne
    @JoinColumn(name = "ticketCategoryID")
    private TicketCategory ticketCategory;

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

    public User1 getUser1() {
        return user;
    }

    public void setUser1(User1 user1) {
        this.user = user1;
    }

    public TicketCategory getTicketCategory() {
        return ticketCategory;
    }

    public void setTicketCategory(TicketCategory ticketCategory) {
        this.ticketCategory = ticketCategory;
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
