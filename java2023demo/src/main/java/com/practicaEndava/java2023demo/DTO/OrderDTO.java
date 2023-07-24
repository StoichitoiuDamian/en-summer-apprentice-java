package com.practicaEndava.java2023demo.DTO;

import java.io.Serializable;
import java.util.Date;

public class OrderDTO {
    private Long orderID;
    private Date orderedAT;

    private  Long ticketCategory;
    private  int numberOfTickets;
    private double totalPrice;

    public OrderDTO(){}
    public OrderDTO(Long orderID, Long ticketCategory, int numberOfTickets) {
        this.orderID = orderID;
        this.ticketCategory = ticketCategory;
        this.numberOfTickets = numberOfTickets;
    }

    public OrderDTO(Long orderID, Date orderedAT, Long ticketCategory, int numberOfTickets, double totalPrice) {
        this.orderID = orderID;
        this.orderedAT = orderedAT;
        this.ticketCategory = ticketCategory;
        this.numberOfTickets =numberOfTickets;
        this.totalPrice =totalPrice;
    }

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


    public Long getTicketCategory() {
        return ticketCategory;
    }

    public void setTicketCategory(Long ticketCategory) {
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
