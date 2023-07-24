package com.practicaEndava.java2023demo.repository;

import com.practicaEndava.java2023demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    User findByuserID(Long userID);
}
