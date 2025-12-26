package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ex17 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
        int sum = 0;

        while (true) {
            System.out.print("숫자를 입력하세요 (종료: quit): ");
            String input = reader.readLine();

            if ("quit".equals(input)) {
                System.out.println("최종 합계: " + sum);
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            
            try {
                int number = Integer.parseInt(input);
                sum += number;
                System.out.println("현재 합계: " + sum);
            } catch (NumberFormatException e) {
                System.out.println("유효하지 않은 숫자입니다. 다시 입력해주세요.");
            }
        }
        }
    }
}