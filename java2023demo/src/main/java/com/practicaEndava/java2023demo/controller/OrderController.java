package com.practicaEndava.java2023demo.controller;

import com.practicaEndava.java2023demo.DTO.OrderDTO;
import com.practicaEndava.java2023demo.model.Order;
import com.practicaEndava.java2023demo.model.TicketCategory;
import com.practicaEndava.java2023demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin
public class OrderController {
    @Autowired
    private OrderService orderService;
    @GetMapping("/showAllOrders")
    public List<Order> showAllOrders(){
        return orderService.orderFindAll();
    }
    @PostMapping("/createOrder")
    public Order createOrder(@RequestBody Order order){
        return orderService.createOrder(order);
    }

    @GetMapping("/orderss/{customerId}")
    public List<OrderDTO> getOrdersByCustomerId(@PathVariable("customerId") Long customerId) {
        List<Order> orders = orderService.getOrdersByCustomerId(customerId);
        return orders.stream().map(this::convertToDto).collect(Collectors.toList());
    }
    private OrderDTO convertToDto(Order order) {
        return new OrderDTO(
                order.getOrderID(),
                order.getOrderedAT(),
                order.getTicketCategoryID().getTicketCategoryID(),
                order.getNumberOfTickets(),
                order.getTotalPrice()
        );
    }
    @GetMapping("/orderanduser/{userID}")
    public List<Order> getOrdersByUserId(@PathVariable("userID") Long userID) {
        return orderService.getOrdersByCustomerId(userID);
    }
    @PostMapping("/orders/{customerId}")
    public OrderDTO createOrderForCustomer(@PathVariable("customerId") Long customerId, @RequestBody OrderDTO orderDTO) {
        Order order = new Order();


        order.setOrderID(orderDTO.getOrderID());
        order.setNumberOfTickets(orderDTO.getNumberOfTickets());

        TicketCategory ticketCategory = new TicketCategory();
        ticketCategory.setTicketCategoryID(orderDTO.getTicketCategory());
        order.setTicketCategoryID(ticketCategory);

        Order savedOrder = orderService.createOrderForCustomer(customerId, order);

        return convertToDtoPost(savedOrder);
    }


    private OrderDTO convertToDtoPost(Order order) {
        return new OrderDTO(
                order.getOrderID(),
                order.getOrderedAT(),
                order.getTicketCategoryID().getTicketCategoryID(),
                order.getNumberOfTickets(),
                order.getTotalPrice()
        );
    }

}
