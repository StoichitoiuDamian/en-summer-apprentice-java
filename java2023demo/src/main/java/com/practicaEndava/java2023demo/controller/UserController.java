package com.practicaEndava.java2023demo.controller;

import com.practicaEndava.java2023demo.model.User;
import com.practicaEndava.java2023demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/showAllUsers")
    public ResponseEntity<List<User>> showAllUsers(){
        List<User> users = userService.userFindAll();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PostMapping("/createUser")
    public ResponseEntity<User> createUser(@RequestBody User user){
        User createdUser = userService.createUser(user);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }
}
