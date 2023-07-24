package com.practicaEndava.java2023demo.DTO;

public class VenueDTO {
  private Long venueID;
  private String venueName;
  private String venueLocation;
  private int capacity;

    public VenueDTO(long venueID, String venueName, String venueLocation, int capacity) {
        this.venueID = venueID;
        this.venueName = venueName;
        this.venueLocation = venueLocation;
        this.capacity = capacity;
    }

    public VenueDTO() {

    }

    public long getVenueID() {
        return venueID;
    }

    public void setVenueID(long venueID) {
        this.venueID = venueID;
    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public String getVenueLocation() {
        return venueLocation;
    }

    public void setVenueLocation(String venueLocation) {
        this.venueLocation = venueLocation;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
