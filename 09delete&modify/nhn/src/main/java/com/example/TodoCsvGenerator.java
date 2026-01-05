package com.example;

public class TodoCsvGenerator {
    static class Todo {
        int id;
        String title;
        int hours;
        boolean done;

        Todo(int id, String title, int hours, boolean done) {
            this.id = id;
            this.title = title;
            this.hours = hours;
            this.done = done;
        }
    }

    public static void main(String[] args) {
        Todo[] todos = {
            new Todo(1, "Java 공부", 3, false),
            new Todo(2, "운동하기", 1, true),
            new Todo(3, "독서", 2, false)
        };

        StringBuilder sb = new StringBuilder();
        for(Todo todo : todos){
            sb.append(todo.id).append(",")
            .append(todo.title).append(",")
            .append(todo.hours).append(",")
            .append(todo.done).append("\n");
        }
        System.out.println(sb.toString());
    }
}