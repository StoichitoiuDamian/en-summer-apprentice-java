package com.practicaEndava.java2023demo.DTO;

public class TicketCategoryDTO {
   private Long ticketCategoryID;
   private int eventID;
  private String descriptionTicketCategory;
  private double price;

    public TicketCategoryDTO(Long ticketCategoryID, int eventID, String descriptionTicketCategory, double price) {
        this.ticketCategoryID = ticketCategoryID;
        this.eventID = eventID;
        this.descriptionTicketCategory = descriptionTicketCategory;
        this.price = price;
    }

    public Long getTicketCategoryID() {
        return ticketCategoryID;
    }

    public void setTicketCategoryID(Long ticketCategoryID) {
        this.ticketCategoryID = ticketCategoryID;
    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
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
