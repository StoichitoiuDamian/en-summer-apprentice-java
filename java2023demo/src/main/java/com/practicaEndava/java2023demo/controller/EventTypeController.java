package com.practicaEndava.java2023demo.controller;

import com.practicaEndava.java2023demo.model.EventType;
import com.practicaEndava.java2023demo.service.EventTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class EventTypeController {
    @Autowired
    private EventTypeService eventTypeService;

    @GetMapping("/showAllEventType")
    public List<EventType> showAllEventTypes(){
        return eventTypeService.eventTypeFindAll();
    }
    @PostMapping("/createEventType")
    public EventType createEventType(@RequestBody EventType eventType){
        return eventTypeService.createEventType(eventType);
    }

}
