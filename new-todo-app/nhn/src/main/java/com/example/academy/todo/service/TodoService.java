package com.example.academy.todo.service;

import com.example.academy.todo.model.Todo;
import java.util.ArrayList;
import java.util.List;

public class TodoService {
    private List<Todo> todoList = new ArrayList<>();

    public void add(Todo todo) {
        todoList.add(todo);
        System.out.println("등록 완료: " + todo.getTitle());
    }

    public void remove(int removeInput) {
        todoList.remove(removeInput);
        System.out.println("삭제 완료!");
    }

    public void modiy(int modifyInput, String newtitle, int newhour) {
        for(Todo modifytodo : todoList) {
            if (modifytodo.getId() == modifyInput) {
                modifytodo.setTitle(newtitle);
                modifytodo.setHour(newhour);
            }
        }
    }

    public List<Todo> getAll() {
        return todoList;
    }

    public void printAll() {
        if (todoList.isEmpty()) {
            System.out.println("등록된 TODO가 없습니다.");
            return;
        }

        System.out.println("=== TODO 목록 ===");
        for (int i = 0; i < todoList.size(); i++) {
            Todo todo = todoList.get(i);
            String status = todo.isDone() ? "[완료]" : "[]";
            System.out.printf("[%d] %s | %d시간 | %s | %s | %s\n", todo.getId()+1, todo.getTitle(), todo.getHour(), todo.getCategory().getDisplayName(), todo.getPriority().getDisplayName(), status); // id, title, hour, category, priority, done
        }
    }

    public void printCategory(){
        if (todoList.isEmpty()) {
            System.out.println("등록된 TODO가 없습니다.");
            return;
        }

        System.out.println("=== TODO 목록 ===");

    }

    public void printPrority(){
        if (todoList.isEmpty()) {
            System.out.println("등록된 TODO가 없습니다.");
            return;
        }
        System.out.println("=== TODO 목록 ===");

    }

    public int count() {
        return todoList.size();
    }
}
