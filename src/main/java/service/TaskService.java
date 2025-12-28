package com.example.taskmanagement.service;

import com.example.taskmanagement.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    private final List<Task> tasks = new ArrayList<>();
    private long idCounter = 1;

    // GET all tasks
    public List<Task> getAllTasks() {
        return tasks;
    }

    // GET single task
    public Task getTask() {
        return new Task(1L, "Learn Spring Boot", true);
    }

    // ADD new task
    public Task addTask(Task task) {
        task.setId(idCounter++);
        tasks.add(task);
        return task;
    }

    // Mark done (demo)
    public String markDone() {
        return "Task marked as done";
    }
}
