package com.example.taskmanagement.controller;

import com.example.taskmanagement.model.Task;
import com.example.taskmanagement.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloController {

    private final TaskService taskService;

    public HelloController(TaskService taskService) {
        this.taskService = taskService;
    }

    // GET all tasks
    @GetMapping("/tasks")
    public List<Task> getTasks() {
        return taskService.getAllTasks();
    }

    // POST new task
    @PostMapping("/tasks")
    public Task createTask(@RequestBody Task task) {
        return taskService.addTask(task);
    }
}
