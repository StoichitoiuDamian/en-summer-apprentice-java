package com.practicaEndava.java2023demo.controller;

import com.practicaEndava.java2023demo.model.Event;
import com.practicaEndava.java2023demo.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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


}
