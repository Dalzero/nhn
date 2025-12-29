package com.nhnacademy.model;

public class Todo {
    //field
    private String title;
    private int hours;
    private boolean done;

    //constructor
    public Todo(String title, int hours) {
        this.title = title;
        this.hours = hours;
        this.done = false;
    }

    //getter & setter
    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}

    public int getHours() {return hours;}
    public void setHours(int hours) {
        if (hours >= 0 && hours < 24) {
            this.hours = hours;
        }else {throw new IllegalArgumentException("0~23 사이의 값을 입력하세요.");}
    }
    
    public boolean isDone() {return done;}
    public void setDone(boolean done) {this.done = done;}
}
