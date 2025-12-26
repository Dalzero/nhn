package com.nhn;
public class ex10 {
    public static void main(String[] args) {
        int age = 25;
        int score = 70;
        System.out.println(age >= 20 && score >= 80); // false
        System.out.println(age >= 20 || score >= 80); // true
        System.out.println(!(age < 20)); // true
    }
}
