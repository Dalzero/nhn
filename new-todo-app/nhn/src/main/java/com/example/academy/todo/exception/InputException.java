package com.example.academy.todo.exception;

import java.io.BufferedReader;
import java.io.IOException;

public class InputException {
    public static int IntInput(String message, int min, int max, BufferedReader reader) {
        while (true) {
            try {
                System.out.print(message);
                String input = reader.readLine();

                if (input == null || input.isBlank()) {
                    continue;
                }

                int value = Integer.parseInt(input);

                if (value >= min && value <= max) {
                    return value;
                }

                System.out.printf("%d ~ %d 사이의 값을 입력하세요.%n", min, max);

            } catch (NumberFormatException e) {
                System.out.println("숫자만 입력 가능합니다. 다시 시도해 주세요.");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static String StirngInput(String message, BufferedReader reader){
        while (true) {
            try {
                System.out.print(message);
                String input = reader.readLine();

                if (input == null || input.isBlank()) {
                    continue;
                }
                return input;
                
            } catch(IOException e) {
                System.out.println(e.getMessage());
            }
        } 
    }
}
