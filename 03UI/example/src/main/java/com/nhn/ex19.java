package com.nhn;
public class ex19 {
    public static void main(String[] args) {
        int day = 3;
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("평일");
            case 6, 7 -> System.out.println("주말");
            default -> System.out.println("잘못된 입력");
        }
    }
}
