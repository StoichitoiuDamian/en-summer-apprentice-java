package com.practicaEndava.java2023demo.controller;

import com.practicaEndava.java2023demo.model.Venue;
import com.practicaEndava.java2023demo.service.VenueService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class VenueController {
    @Autowired
    private VenueService venueService;

    @GetMapping("/showAllVenues")
    public List<Venue> showAllVenues(){
        return venueService.venueFindAll();
    }

    @PutMapping("/updateVenue/{id}")
        public Venue updateVenueById(@PathVariable Long id,@RequestBody Venue venue){
        return venueService.venueUpdateById(id,venue);
    }
    @PostMapping("/createVenue")
    public Venue createVenue(@RequestBody Venue venue){
        return venueService.createVenue(venue);
    }
    @DeleteMapping("/deleteAllVenues")
    public void deleteAllVenues(){
        venueService.venueDeleteAll();
    }
    @GetMapping("/findVenueById/{id}")
    public Venue findVenueById(@PathVariable Long id){
        Venue venue = new Venue();
        try {
            venue = venueService.venueFindById(id);
        }catch(EntityNotFoundException exception){
            System.out.println("Venue not found");
        }
        return venue;
    }
    @DeleteMapping("/deleteVenueById/{id}")
    public void deleteVenueById(@PathVariable Long id){
        venueService.venueDeleteById(id);
    }
}
