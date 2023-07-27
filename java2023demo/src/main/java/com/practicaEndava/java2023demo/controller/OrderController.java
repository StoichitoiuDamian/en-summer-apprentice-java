package com.practicaEndava.java2023demo.controller;

import com.practicaEndava.java2023demo.DTO.OrderDTO;
import com.practicaEndava.java2023demo.model.Order;
import com.practicaEndava.java2023demo.model.TicketCategory;
import com.practicaEndava.java2023demo.service.OrderService;
import com.practicaEndava.java2023demo.service.TicketCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin
public class OrderController {

    private OrderService orderService;

    private TicketCategoryService ticketCategoryService;

    @Autowired
    public OrderController(OrderService orderService, TicketCategoryService service) {
        this.orderService = orderService;
        this.ticketCategoryService= service;
    }



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
    public OrderDTO createOrderForCustomer(@PathVariable Long customerId, @RequestBody OrderDTO orderDTO) {
        TicketCategory ticketCategory=ticketCategoryService.findTicketById(orderDTO.getTicketCategory());
        System.out.println(orderDTO.getTicketCategory());

         double totalPrice=ticketCategory.getPrice()*orderDTO.getNumberOfTickets();

        Date orderedAT=new Date();
        OrderDTO orderDTO1=new OrderDTO();

        orderDTO1.setOrderID(orderDTO.getOrderID());
        orderDTO1.setTicketCategory(orderDTO.getTicketCategory());
        orderDTO1.setOrderedAT(orderedAT);
        orderDTO1.setNumberOfTickets(orderDTO.getNumberOfTickets());
        orderDTO1.setTotalPrice(totalPrice);
        orderService.saveOrderFormClient(orderDTO,customerId);

        return orderDTO1;
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
