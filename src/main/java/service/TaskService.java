package com.example.taskmanagement.service;

import com.example.taskmanagement.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    public Task getTask() {
        return new Task(1L, "Learn Spring Boot", true);
    }

    // ✅ FIXED METHOD
    public List<Task> getAllTasks() {
        List<Task> tasks = new ArrayList<>();

        tasks.add(new Task(1L, "Learn Spring Boot", false));
        tasks.add(new Task(2L, "Build REST APIs", true));
        tasks.add(new Task(3L, "Learn Git & GitHub", false));

        return tasks;
    }

    public String markDone() {
        return "Task marked as done";
    }
}
