package com.example.taskmanagement.controller;

import com.example.taskmanagement.model.Task;
import com.example.taskmanagement.service.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    private final TaskService taskService;


    public HelloController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/number")
    public int number(){
        return 10;

    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Task Management System";
    }

    @GetMapping("/task")
    public Task getTask() {
        return taskService.getTask();
    }

    @GetMapping("/done")
    public String done() {
        return taskService.markDone();
    }

    // ✅ FIXED METHOD
    @GetMapping("/tasks")
    public List<Task> getTasks() {
        return taskService.getAllTasks();
    }
}
