package com.example;

public class Calculator
{   
    public void divide(int a, int b) {
        System.out.println("계산 시작");
        
        try {
            int result = a / b;
            System.out.println("결과: " + result);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다");
        } finally {
            System.out.println("계산 종료");
        }
    }
}

