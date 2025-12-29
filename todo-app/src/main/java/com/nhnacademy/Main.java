package com.nhnacademy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import com.nhnacademy.model.Todo;
import com.nhnacademy.model.Category;
import com.nhnacademy.model.Priority;
import com.nhnacademy.service.TodoService;

public class Main {
    public static void main(String[] args) {
        // service construction
        TodoService Service = new TodoService();
        // Exit loop flag
        boolean stopword = false;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (!stopword) {
                System.out.println("\n=== TODO 앱 ===");
                System.out.println("1. 등록");
                System.out.println("2. 조회");
                System.out.println("3. Todo 개수");
                System.out.println("0. 종료");
                System.out.print("선택 > ");

                String input = reader.readLine();

                switch (input) {
                    case "0" -> {
                        System.out.println("프로그램을 종료합니다.");
                        stopword = true;
                    }

                    case "1" -> {
                        System.out.println("\n=== TODO 등록 ===");

                        String titleInput = null;
                        while (titleInput == null || titleInput.trim().isEmpty()) {
                            System.out.print("제목 > ");
                            titleInput = reader.readLine();
                            if (titleInput == null || titleInput.trim().isEmpty()) {
                                System.out.println("제목은 비어 있을 수 없습니다.");
                            }
                        }

                        int hoursInput = -1;
                        while (hoursInput < 0 || hoursInput >= 24) {
                            try {
                                System.out.print("예상 소요 시간(시간) > ");
                                hoursInput = Integer.parseInt(reader.readLine());
                                if (hoursInput < 0 || hoursInput >= 24) {
                                    System.out.println("0~23 사이의 값을 입력하세요.");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("유효한 정수를 입력하세요.");
                            }
                        }

                        Todo todo = new Todo(titleInput, hoursInput);
                        Service.add(todo);

                        System.out.println("등록 완료: ");
                    }

                    case "2" -> {
                        System.out.println("\n=== TODO 목록 ===");
                        Service.printAll();
                    }

                    case "3" -> {
                        System.out.println("\n=== TODO 개수 ===");
                        System.out.println("총 TODO 개수: " + Service.count());
                    }

                    default -> System.out.println("잘못된 입력입니다.");
                }
            }
        } catch (IOException e) {
            System.err.println("입력을 읽는 도중 오류가 발생했습니다: " + e.getMessage());
        }
    }
}
