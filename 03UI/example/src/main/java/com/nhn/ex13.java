package com.nhn;
public class ex13 {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        if(x > 5 && y > 3) {
            System.out.println("조건1 만족");
        }
        if(x > 15) {
            System.out.println("조건2 만족");
        }
        if(!(x < 5)) {
            System.out.println("조건3 만족");
        }
        // 조건1 만족
        // 조건3 만족
    }
}
