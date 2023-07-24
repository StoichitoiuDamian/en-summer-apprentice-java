package com.practicaEndava.java2023demo.controller;

import com.practicaEndava.java2023demo.model.TicketCategory;
import com.practicaEndava.java2023demo.model.User;
import com.practicaEndava.java2023demo.service.TicketCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TicketCategoryController {
    @Autowired
    private TicketCategoryService ticketCategoryService;
    @GetMapping("/showAllTicketsCategory")
    public List<TicketCategory> showAllTicketsCategory(){
        return ticketCategoryService.ticketCategoryFindAll();
    }

    @PostMapping("/createTicketCategory")
    public TicketCategory createTicketCategory(@RequestBody TicketCategory ticketCategory){
        return ticketCategoryService.createTicketCategory(ticketCategory);
    }
}
