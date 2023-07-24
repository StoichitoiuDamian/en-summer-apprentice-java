package com.practicaEndava.java2023demo.repository;

import com.practicaEndava.java2023demo.model.Venue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VenueRepository extends JpaRepository<Venue,Long> {

}
