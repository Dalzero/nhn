package com.example;
public class ex23 {
    public static void main(String[] args) {
        int score = 85;
        String grade = switch (score/10) {
            case 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            default -> {System.out.print("재시험 대상입니다."); yield "F";}
        };
        System.out.println("grade = " + grade);
    }
}
