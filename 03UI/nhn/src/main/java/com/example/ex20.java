package com.example;
public class ex20 {
    public static void main(String[] args) {
        int a = 10, b = 3;
        String op = "/";
        int result = switch (op) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> {
                if (b == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    yield 0;
                }
                yield a / b;
            }
            default -> {
                System.out.println("잘못된 연산자");
                yield 0;
            }
        };
        System.out.println("result: " + result); // 3
    }
}
