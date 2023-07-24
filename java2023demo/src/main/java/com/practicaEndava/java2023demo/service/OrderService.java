package com.practicaEndava.java2023demo.service;

import com.practicaEndava.java2023demo.DTO.OrderDTO;
import com.practicaEndava.java2023demo.model.Order;
import com.practicaEndava.java2023demo.model.TicketCategory;
import com.practicaEndava.java2023demo.model.User;
import com.practicaEndava.java2023demo.repository.OrderRepository;
import com.practicaEndava.java2023demo.repository.TicketCategoryRepository;
import com.practicaEndava.java2023demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {


    private OrderRepository orderRepository;
    private TicketCategoryRepository ticketCategoryRepository;

    private UserRepository userRepository;
    @Autowired
    public OrderService(OrderRepository orderRepository, UserRepository userRepository, TicketCategoryRepository ticketCategory){
        this.orderRepository=orderRepository;
        this.userRepository=userRepository;
        this.ticketCategoryRepository=ticketCategory;

    }

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

    public void saveOrderFormClient(OrderDTO orderDTO,Long customerId) {

        Order order1=new Order();
        TicketCategory ticketCategoryOrdered=ticketCategoryRepository.findTicketCategoryByticketCategoryID(orderDTO.getTicketCategory());

        User user=userRepository.findByuserID(customerId);
        order1.setUser(user);
        order1.setTicketCategoryID(ticketCategoryOrdered);
        order1.setNumberOfTickets(orderDTO.getNumberOfTickets());
        order1.setTotalPrice(orderDTO.getTotalPrice());
        order1.setOrderedAT(orderDTO.getOrderedAT());

        orderRepository.save(order1);

    }
    public Order createOrderForCustomerDTO(Long customerId, Order order) {
        // Setăm utilizatorul pentru comandă
        User user = new User();
        user.setUserID(customerId);
        order.setUser(user);

        return createOrder(order);
    }
}
