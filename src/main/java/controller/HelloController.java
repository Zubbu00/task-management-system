package com.example.taskmanagement.controller;

import com.example.taskmanagement.model.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // API 1: Hello
    @GetMapping("/hello")
    public String hello() {
        return "Hello from Task Management System";
    }

    // API 2: Task (JSON response)
    @GetMapping("/task")
    public Task getTask() {
        return new Task(1L, "Learn Spring Boot", false);
    }

    // API 3: Server status
    @GetMapping("/status")
    public String status() {
        return "Server is running successfully";
    }

    @GetMapping("/done ")
    public String done() {
        return "The task is done ";
    }
}
