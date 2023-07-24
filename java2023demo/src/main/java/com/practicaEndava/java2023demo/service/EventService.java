package com.practicaEndava.java2023demo.service;

import com.practicaEndava.java2023demo.DTO.EventDTO;
import com.practicaEndava.java2023demo.DTO.VenueDTO;
import com.practicaEndava.java2023demo.model.Event;
import com.practicaEndava.java2023demo.model.Venue;
import com.practicaEndava.java2023demo.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;

    public List<Event> eventFindAll(){
        return eventRepository.findAll();
    }

    public Event createEvent(Event event){
        return eventRepository.save(event);
    }


}
