package com.example.taskmanagement.service;

import com.example.taskmanagement.model.Task;
import com.example.taskmanagement.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    // GET all tasks
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    // ADD task
    public Task addTask(Task task) {
        task.setCompleted(false);
        return taskRepository.save(task);
    }

    // MARK DONE
    public Task markDone(Long id) {
        Task task = taskRepository.findById(id).orElseThrow();
        task.setCompleted(true);
        return taskRepository.save(task);
    }

    // DELETE
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}
