package com.practicaEndava.java2023demo.service;

import com.practicaEndava.java2023demo.model.TicketCategory;
import com.practicaEndava.java2023demo.repository.TicketCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketCategoryService {

    @Autowired
    TicketCategoryRepository ticketCategoryRepository;

    public List<TicketCategory> ticketCategoryFindAll(){
        return ticketCategoryRepository.findAll();
    }

    public TicketCategory createTicketCategory(TicketCategory ticketCategory){
        return ticketCategoryRepository.save(ticketCategory);
    }

    public TicketCategory findTicketById(Long id){
        return ticketCategoryRepository.findTicketCategoryByticketCategoryID(id);
    }

}
