package com.practicaEndava.java2023demo.service;

import com.practicaEndava.java2023demo.model.TicketCategory;
import com.practicaEndava.java2023demo.model.User;
import com.practicaEndava.java2023demo.model.Venue;
import com.practicaEndava.java2023demo.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){this.userRepository = userRepository;}

    public  UserRepository userRepository(){return userRepository;}

    public void setUserRepository(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> userFindAll(){
        return userRepository.findAll();
    }

    public User createUser(User user){
        return userRepository.save(user);
    }

}
