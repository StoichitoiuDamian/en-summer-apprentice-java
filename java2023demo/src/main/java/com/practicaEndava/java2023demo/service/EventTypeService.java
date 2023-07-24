package com.practicaEndava.java2023demo.service;

import com.practicaEndava.java2023demo.model.EventType;
import com.practicaEndava.java2023demo.repository.EventTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventTypeService {

    @Autowired
    private EventTypeRepository eventTypeRepository;

    public List<EventType> eventTypeFindAll(){
        return eventTypeRepository.findAll();
    }

    public EventType createEventType(EventType eventType){
        return eventTypeRepository.save(eventType);
    }
}
