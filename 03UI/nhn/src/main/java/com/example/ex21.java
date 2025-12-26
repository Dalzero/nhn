package com.example;
public class ex21 {
    public static void main(String[] args) {
        int day = 3;
        String type;
        switch (day) {
            case 1, 2, 3, 4, 5 -> type = "평일";
            case 6, 7 -> type = "주말";
            default -> type = "잘못된 입력";
        }
        System.out.println(type);
    }
}
