package com.nhnacademy.service;

import com.nhnacademy.model.Todo;
import java.util.ArrayList;
import java.util.List;

public class TodoService {
    private List<Todo> todoList = new ArrayList<>();

    // 등록
    public void add(Todo todo) {
        todoList.add(todo);
        System.out.println("등록 완료: " + todo.getTitle());
    }

    // 전체 조회
    public List<Todo> getAll() {return todoList;}

    // 목록 출력
    public void printAll() {
        if (todoList.isEmpty()) {
            System.out.println("등록된 TODO가 없습니다.");
            return;
        }

        System.out.println("=== TODO 목록 ===");
        for (int i = 0; i < todoList.size(); i++) {
            Todo todo = todoList.get(i);
            String status = todo.isDone() ? "[완료]" : "[미완료]";
            System.out.printf("[%d] | %s | (%d시간) | %s | %s | %s", todo.getId(), todo.getTitle(), todo.getHours(), todo.getCategory().getDisplayName(), todo.getPriority().getDisplayName(), status); // id, title, hour, category, priority, done
        }
    }

    // 개수 조회
    public int count() {return todoList.size();}
}
