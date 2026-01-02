package com.example;

public class TodoNotFoundException extends RuntimeException {
    public TodoNotFoundException(String message){
        super(message);
    }

    public TodoNotFoundException(int id){
        super("ID not found");
    }
}
