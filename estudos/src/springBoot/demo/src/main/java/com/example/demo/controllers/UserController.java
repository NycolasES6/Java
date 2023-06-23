package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.User;
import com.fasterxml.jackson.core.JsonParser;

@RestController
@RequestMapping("/users")

public class UserController {

    private List<User> users = new ArrayList<User>();

    //Get
    @GetMapping("/{id}")
    public User user(@PathVariable("id") UUID id){

        System.out.println("o id é " + id);

        Optional <User> userFind = users.stream().filter(user -> user.getId() == id).findFirst();

        if(userFind.isPresent())
            return userFind.get();

        return null;
    }

    // Post
    @PostMapping("/")
    public User user(@RequestBody User user){
        users.add(user);
        return user;
    }

    // GET user/list
    @GetMapping("/list")
    public List<User> list(){
        return users;
    }

}
