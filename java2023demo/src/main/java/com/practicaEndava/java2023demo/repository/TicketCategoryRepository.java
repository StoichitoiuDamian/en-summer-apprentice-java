package com.practicaEndava.java2023demo.repository;

import com.practicaEndava.java2023demo.model.TicketCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketCategoryRepository extends JpaRepository<TicketCategory,Long> {

    TicketCategory findTicketCategoryByticketCategoryID(Long id);
}
