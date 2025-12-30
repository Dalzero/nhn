package com.nhnacademy.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Todo {
    // field
    private String title;
    private int hours;
    private boolean done;

    private int id;
    private static int idCounter = 1;
    private Category category;
    private Priority priority;
    private LocalDate dueDate;
    private LocalDateTime createAt;

    // constructor
    public Todo(String title, int hours, Category category, Priority priority, LocalDate dueDate) {
        this.id = idCounter++;
        this.title = title;
        this.hours = hours;
        this.done = false;
        this.category = category;
        this.priority = priority;
        this.dueDate = dueDate;
        this.createAt = LocalDateTime.now();
    }

    // getter & setter
    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}

    public int getHours() {return hours;}
    public void setHours(int hours) {
        if (hours >= 0 && hours < 24) {
            this.hours = hours;
        } else {
            throw new IllegalArgumentException("0~23 사이의 값을 입력하세요.");
        }
    }

    public boolean isDone() {return done;}
    public void setDone(boolean done) {this.done = done;}

    public int getId() {return id;}

    public Category getCategory() {return category;}
    public void setCategory(Category category) {this.category = category;}

    public Priority getPriority() {return priority;}
    public void setPriority(Priority priority) {this.priority = priority;}

    public LocalDate getDueDate() {return dueDate;}
    public void setGetDueDate(LocalDate duDate) {this.dueDate = duDate;}

    public LocalDateTime getCreateAt() {return createAt;}
}
