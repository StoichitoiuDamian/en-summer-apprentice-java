package com.practicaEndava.java2023demo.service;

import com.practicaEndava.java2023demo.DTO.OrderDTO;
import com.practicaEndava.java2023demo.model.Event;
import com.practicaEndava.java2023demo.model.Order;
import com.practicaEndava.java2023demo.model.TicketCategory;
import com.practicaEndava.java2023demo.model.User;
import com.practicaEndava.java2023demo.repository.OrderRepository;
import com.practicaEndava.java2023demo.repository.TicketCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {
@Autowired
    private OrderRepository orderRepository;
    private TicketCategoryRepository ticketCategoryRepository;
    public List<Order> orderFindAll(){
        return orderRepository.findAll();
    }

    public Order createOrder(Order order){
        return orderRepository.save(order);
    }

    public List<Order> getOrdersByCustomerId(Long customerId) {
        return orderRepository.findByUser_userID(customerId);
    }

    public Order createOrderForCustomer(Long customerId, Order order) {
        return orderRepository.save(order);
    }

    public Order createOrderForDTO(Order order) {

        order.setOrderedAT(new Date());

        TicketCategory ticketCategory = ticketCategoryRepository.findById(order.getTicketCategoryID().getTicketCategoryID()).orElse(null);
        if (ticketCategory != null) {
            double totalPrice = ticketCategory.getPrice() * order.getNumberOfTickets();
            order.setTotalPrice(totalPrice);
        }

        return orderRepository.save(order);
    }
    public Order createOrderForCustomerDTO(Long customerId, Order order) {
        // Setăm utilizatorul pentru comandă
        User user = new User();
        user.setUserID(customerId);
        order.setUser(user);

        return createOrder(order);
    }
}
