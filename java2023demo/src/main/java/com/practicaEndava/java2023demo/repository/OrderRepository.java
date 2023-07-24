package com.practicaEndava.java2023demo.repository;

import com.practicaEndava.java2023demo.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {

    List<Order> findByUser_userID(Long customerId);
}
