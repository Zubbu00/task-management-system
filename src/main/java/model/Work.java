package com.example.taskmanagement.model;

public class Work {

    private int id;
    private String name;
    private double timing;

    // Constructor
    public Work(int id, String name, double timing) {
        this.id = id;
        this.name = name;
        this.timing = timing;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getTiming() {
        return timing;
    }
}
