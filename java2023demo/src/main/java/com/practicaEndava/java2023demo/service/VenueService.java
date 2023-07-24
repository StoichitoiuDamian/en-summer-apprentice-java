package com.practicaEndava.java2023demo.service;

import com.practicaEndava.java2023demo.model.Venue;
import com.practicaEndava.java2023demo.repository.VenueRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VenueService {
    @Autowired
    private VenueRepository venueRepository;

    @Autowired
    public VenueService(VenueRepository venueRepository){this.venueRepository = venueRepository;}

    public VenueRepository venueRepository(){return venueRepository;}

    public void setVenueRepository(VenueRepository venueRepository){
        this.venueRepository = venueRepository;
    }

    public List<Venue> venueFindAll(){
        return venueRepository.findAll();
    }

    public void venueDeleteAll(){
        venueRepository.deleteAll();
    }

    public Venue createVenue(Venue venue){
        return venueRepository.save(venue);
    }

    public Venue venueUpdateById(Long venueID, Venue venue){
        Optional<Venue> updateVenue = venueRepository.findById(venueID);
        long venueId = venue.getVenueID();
        String venue_location = venue.getVenueLocation();
        String venue_type = venue.getVenueType();
        int venue_capacity = venue.getVenueCapacity();

        return venueRepository.save(venue);
    }

    public Venue venueFindById(Long venueId){
        Optional<Venue> venueFindById = venueRepository.findById(venueId);
        if(venueFindById.isPresent()){
            return venueFindById.get();
        }else{
            throw new EntityNotFoundException("Venue with id "+venueId+" not found");
        }
    }
    public void venueDeleteById(Long venueId){
        Optional<Venue> venueDeleteById = venueRepository.findById(venueId);
        if(venueDeleteById.isPresent()){
            venueRepository.deleteById(venueId);
        }else{
            throw new EntityNotFoundException("Venue with id "+venueId+" not found");
        }
    }
}
