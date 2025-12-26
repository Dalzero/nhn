package com.example;
public class ex24 {
    public static void main(String[] args) {
        int i =0;
        while (i < 5 ) {
            i++;
            if (i == 3) {
                System.out.println("종료");
                break;
            }
            System.out.println(i);
        }
    }
}
