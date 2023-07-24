package com.practicaEndava.java2023demo.controller;

import com.practicaEndava.java2023demo.DTO.EventDTO;
import com.practicaEndava.java2023demo.DTO.TicketCategoryDTO;
import com.practicaEndava.java2023demo.model.Event;
import com.practicaEndava.java2023demo.model.TicketCategory;
import com.practicaEndava.java2023demo.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping("/showAllEvents")
    public List<Event> showAllEvents(){
        return eventService.eventFindAll();
    }
    @PostMapping("/createEvent")
    public Event createEvent(@RequestBody Event event){
        return eventService.createEvent(event);
    }

    @GetMapping("/events")
    public List<EventDTO> getEventsByVenueIdAndEventType(@RequestParam("venueID") Long venueId, @RequestParam("evenutType") String eventType) {
        List<Event> events = eventService.getEventsByVenueIdAndEventType(venueId, eventType);
        System.out.println(events);

        // Transformăm lista de obiecte Event în EventDTO
        List<EventDTO> eventDTOList = events.stream()
                .map(this::mapEventToDTO)
                .collect(Collectors.toList());

        return eventDTOList;
    }
    private EventDTO mapEventToDTO(Event event) {
        List<TicketCategoryDTO> ticketCategoryDTOList = new ArrayList<>();
        for(TicketCategory ticketCategory: event.getTicketCategories()){
            TicketCategoryDTO ticketCategoryDTO=new TicketCategoryDTO(ticketCategory);
            ticketCategoryDTOList.add(ticketCategoryDTO);
        }

        return new EventDTO(
                event.getEventID(),
                event.getVenueID().getVenueID().intValue(),
                event.getEventTypeID().getEventTypeID().intValue(),
                event.getEventName(),
                event.getDescriptionEvent(),
                event.getStartDate(),
                event.getEndDate(),
                ticketCategoryDTOList
        );
    }
}
