package com.example;

public class CsvParserExercise {
    public static void main( String[] args ) {
        String csvLine = "홍길동,30,서울,true";
        String[] parts = csvLine.split(",");

        String name = parts[0];
        int age = Integer.parseInt(parts[1]);
        String city = parts[2];
        boolean isActive = Boolean.parseBoolean(parts[3]);

        System.out.printf("이름: %s, 나이: %d, 도시: %s, 활성: %b%n", name, age, city, isActive);

        
    }
}
