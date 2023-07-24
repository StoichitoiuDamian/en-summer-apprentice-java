package com.practicaEndava.java2023demo.DTO;

import java.util.Date;
import java.util.List;

public class EventDTO {
   private Long eventID ;
  private int venue ;
   private int eventTypeID;
  private String eventName ;
 private String descriptionEvent;
  private Date startDate;
  private Date endDate;

    private List<TicketCategoryDTO> ticketCategories;

    public EventDTO() {

    }

    public List<TicketCategoryDTO> getTicketCategories() {
        return ticketCategories;
    }

    public EventDTO(Long eventID, int venue, int eventTypeID, String eventName, String descriptionEvent, Date startDate, Date endDate, List<TicketCategoryDTO> ticketCategories) {
        this.eventID = eventID;
        this.venue = venue;
        this.eventTypeID = eventTypeID;
        this.eventName = eventName;
        this.descriptionEvent = descriptionEvent;
        this.startDate = startDate;
        this.endDate = endDate;
        this.ticketCategories = ticketCategories;
    }

    public void setTicketCategories(List<TicketCategoryDTO> ticketCategories) {
        this.ticketCategories = ticketCategories;
    }

    public EventDTO(Long eventID, int venue, int eventTypeID, String eventName, String descriptionEvent, Date startDate, Date endDate) {
        this.eventID = eventID;
        this.venue = venue;
        this.eventTypeID = eventTypeID;
        this.eventName = eventName;
        this.descriptionEvent = descriptionEvent;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Long getEventID() {
        return eventID;
    }

    public void setEventID(Long eventID) {
        this.eventID = eventID;
    }

    public int getVenue() {
        return venue;
    }

    public void setVenue(int venue) {
        this.venue = venue;
    }

    public int getEventTypeID() {
        return eventTypeID;
    }

    public void setEventTypeID(int eventTypeID) {
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
}
