package com.example.academy.todo.service;

import com.example.academy.todo.model.Todo;
import com.example.academy.todo.model.Category;
import com.example.academy.todo.model.Priority;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TodoService {
    private List<Todo> todoList = new ArrayList<>();

    public void printMenu() {
        System.out.println("=== TODO 앱 ===");
        System.out.println("1. 등록");
        System.out.println("2. 조회");
        System.out.println("3. 수정");
        System.out.println("4. 삭제");
        System.out.println("0. 종료");
        System.out.print("선택 > ");
    }

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

    public void saveToFile(){
        String filename = "todo.csv";

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filename))){
            for(Todo todo : todoList){
                String line = todo.getId() + "," + todo.getTitle() + "," + todo.getHour() + "," + todo.isDone() + "," + todo.getCategory() + "," + todo.getPriority();
                writer.write(line);
                writer.newLine();
            }
            System.out.println("파일 저장 완료: " + filename + " (" + todoList.size() + "건)");
        } catch (IOException e) {
            System.out.println("파일 저장 실패");
        }
        
    }

    public void loadFromFile(){
        String filename = "todo.csv";
        File file = new File(filename);

        if (!file.exists()) {
            System.out.println("파일이 존재하지 않습니다.");
            return;
        }

        try(BufferedReader reader = new BufferedReader(new FileReader(filename))){
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");

                int id = Integer.parseInt(parts[0]);
                String title = parts[1];
                int hour = Integer.parseInt(parts[2]);
                boolean done = Boolean.parseBoolean(parts[3]);
                Category category = Category.valueOf(parts[4]);
                Priority priority = Priority.valueOf(parts[5]);

                todoList.add(new Todo(id, title, hour, done, category, priority));

            }
        } catch (IOException e){
            System.out.println("파일 로드 실패");
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

    public void printPriority(){
        if (todoList.isEmpty()) {
            System.out.println("등록된 TODO가 없습니다.");
                return;
        }

        System.out.println("=== 중요도별 TODO 목록 ===");
        for (Priority priority : Priority.values()) {
            System.out.println("--- " + priority.getDisplayName() + " ---");
            for (Todo todo : todoList) {
                if (todo.getPriority() == priority) {
                    String status = todo.isDone() ? "[완료]" : "[]";
                    System.out.printf("[%d] %s | %d시간 | %s | %s\n", todo.getId()+1, todo.getTitle(), todo.getHour(), todo.getPriority().getDisplayName(), status);
                }
            }
        }
    }

    public void printCategory() {
        if (todoList.isEmpty()) {
            System.out.println("등록된 TODO가 없습니다.");
            return;
        }

        System.out.println("=== 카테고리별 TODO 목록 ===");
        for (Category category : Category.values()) {
            System.out.println("--- " + category.getDisplayName() + " ---");
            todoList.stream().filter(todo -> todo.getCategory() == category).forEach(todo -> {
                String status = todo.isDone() ? "[완료]" : "[]";
                System.out.printf("[%d] %s | %d시간 | %s | %s\n", todo.getId() + 1, todo.getTitle(), todo.getHour(), todo.getPriority().getDisplayName(), status);
            });
        }
    }




    public int count() {
        return todoList.size();
    }
}
