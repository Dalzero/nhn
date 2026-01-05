package com.example;

public class PerformanceComparison {
    public static void main(String[] args) {
        int iteration = 1000;

        long StartA = System.nanoTime();
        String resultA = "";
        for (int i = 0; i < iteration ; i++){
            resultA += i + "번째";
        }
        long EndA = System.nanoTime();
        long DurationA = (EndA - StartA) / 1000000;

        System.out.println("duration time : " + DurationA + "ms");

        long StartB = System.nanoTime();
        StringBuilder resultB = new StringBuilder();
        for ( int i = 0 ; i < iteration ; i++  ){
            resultB.append(i).append("번째");
        }
        long EndB = System.nanoTime();
        long DurationB = (EndB - StartB) / 1000000;

        System.out.println("duration time : " + DurationB + "ms");
    }
}
