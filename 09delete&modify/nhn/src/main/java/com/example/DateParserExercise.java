package com.example;

public class DateParserExercise {
    public static void main(String[] args){
        String isoDate = "2024-01-15";
        
        String year = isoDate.substring(0,4);
        String month = isoDate.substring(5,7);
        String day = isoDate.substring(8,10);

        System.out.printf("%s년 %s월 %s일%n", year, month, day);
    }
}
