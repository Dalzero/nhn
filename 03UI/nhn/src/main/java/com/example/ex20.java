package com.example;
public class ex20 {
    public static void main(String[] args) {
        int a = 10, b = 3;
        String op = "/";
        int result = 0;
        switch (op) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                System.out.println("잘못된 연산자");
        }
        System.out.println("result: " + result); // 3
    }
}
