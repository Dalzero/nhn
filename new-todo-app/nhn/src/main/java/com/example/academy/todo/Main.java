package com.example.academy.todo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.example.academy.todo.model.Todo;
import com.example.academy.todo.model.Category;
import com.example.academy.todo.model.Priority;
import com.example.academy.todo.service.TodoService;
import com.example.academy.todo.exception.InputException;



public class Main 
{
    public static void main( String[] args ) throws IOException{
        TodoService Service = new TodoService();

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            while(true){
                System.out.println("=== TODO 앱 ===");
                System.out.println("1. 등록");
                System.out.println("2. 조회");
                System.out.println("3. 수정");
                System.out.println("4. 삭제");
                System.out.println("0. 종료");
                System.out.print("선택 > ");

                String Input = reader.readLine();

                switch (Input) {
                    case "0" -> {
                        System.out.println("프로그램을 종료합니다.");
                        return;
                    }
                    case "1" -> {
                        String title = InputException.StirngInput("제목 > ", reader);
                        int hour = InputException.IntInput("예상 시간 > ", 0, 23, reader);
                        int categoryInput = InputException.IntInput("구분 (1:WORK, 2:STUDY, 3:PERSONAL, 4:HEALTH, 5:OTHER) >  ", 1, 5, reader);
                        int priorityInput = InputException.IntInput("중요도 (1:LOW, 2:MEDIUM, 3:HIGH) >  ", 1, 3, reader);

                        Category category = Category.fromNumber(categoryInput);
                        Priority priority = Priority.fromNumber(priorityInput);

                        Todo todo = new Todo(title, hour, category, priority);
                        Service.add(todo);
                    }
                    case "2" -> {
                        boolean escape = true;
                        while(escape){
                            System.out.println("1. 전체 조회");
                            System.out.println("2. 구분별 조회");
                            System.out.println("3. 중요도별 조회");
                            System.out.println("0. 이전");
                            System.out.print("선택 > ");

                            String checkInput = reader.readLine();

                            switch (checkInput) {
                                case "0" -> {
                                    escape = false;
                                }
                                case "1" -> {
                                    Service.printAll();
                                }
                                case "2" -> {
                                    Service.printCategory();
                                }
                                case "3" -> {
                                    Service.printPrority();
                                }
                                default -> System.out.println("0부터 3 이내의 정수를 입력해주세요.");
                            }
                        }
                    }
                    case "3" -> {
                        int modifyInput = InputException.IntInput("수정할 TODO ID > ", 0,Service.count(),reader);
                        String newtitle = InputException.StirngInput("제목 > ", reader);
                        int newhour = InputException.IntInput("예상 시간 > ", 0, 23, reader);

                        Service.modiy(modifyInput, newtitle, newhour);

                        System.out.println("수정 완료!");
                    }
                    case "4" -> {
                        int removeInput = InputException.IntInput("삭제할 TODO ID > ", 0,Service.count(),reader);
                        Service.remove(removeInput);
                    }
                    default -> System.out.println("0부터 4 이내의 정수를 입력해주세요.");
                }
            } 
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}

