package com.example.academy.todo.exception;

public class TodoNotFoundException extends RuntimeException {

    public TodoNotFoundException(String message) {
        super(message);
    }

    public TodoNotFoundException(int id) {
        super("TODO를 찾을 수 없습니다. ID: " + id);
    }
}