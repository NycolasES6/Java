package com.example.firstWebProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.firstWebProject.model.Task;

@Controller
public class TaskController {

    @GetMapping("/create")
    public String home(){
        return "create";
    }
    @PostMapping("/create")
    public void create(Task task){
        System.out.println("O nome a tarefa é " + task.getName());
    }
}
