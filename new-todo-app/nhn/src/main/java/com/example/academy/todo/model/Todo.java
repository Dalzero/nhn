package com.example.academy.todo.model;

public class Todo {
    private int id;
    private String title;
    private int hour;
    private boolean done;
    private Category category;
    private Priority priority;

    private static int idCount = 0;

    public Todo(String title, int hour, Category category, Priority priority){
        id = idCount++;
        this.title = title;
        this.hour = hour;
        done = false;
        this.category = category;
        this.priority = priority;
    }

    public Todo(int id, String title, int hour, boolean done, Category category, Priority priority){
        this.id = id;
        this.title = title;
        this.hour = hour;
        this.done = done;
        this.category = category;
        this.priority = priority;
    }

    public String getTitle() {return title; }
    public void setTitle(String title) {this.title = title; }

    public int getHour() {return hour; }
    public void setHour(int hour) {this.hour = hour; }

    public boolean isDone(){return done; }
    public void setDone(boolean done) {this.done = done; }

    public Category getCategory() {return category; }
    public void setCategory(Category category) {this.category = category; }

    public Priority getPriority() {return priority; }
    public void setPriority(Priority priority) {this.priority = priority; }
    
    public int getId() {return id; }
}
