package com.example;
public class ex16 {
    public static void main(String[] args) {
        int a = 15, b = 27, c = 12;
        int max;

        if (a >= b && a>=c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;        
        } else if (c >= a && c>=b) {
            max = c;
        } else {
            max = 0;
        }

        System.out.println("max: " + max); // 27
    }
}
