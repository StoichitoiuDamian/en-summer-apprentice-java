package com.practicaEndava.java2023demo.DTO;

import com.practicaEndava.java2023demo.model.TicketCategory;
import com.practicaEndava.java2023demo.model.Venue;

public class TicketCategoryDTO {
   private Long ticketCategoryID;
   private int eventID;
  private String descriptionTicketCategory;
  private double price;

    public TicketCategoryDTO(TicketCategory ticketCategory) {

        this.ticketCategoryID = ticketCategory.getTicketCategoryID();
        this.eventID = Math.toIntExact(ticketCategory.getEventID().getEventID());
        this.descriptionTicketCategory = ticketCategory.getDescriptionTicketCategory();
        this.price = ticketCategory.getPrice();
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
