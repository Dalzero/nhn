package com.example;

public class ex14 {
    public static void main(String[] args) throws Exception{
        int n = 5;
        int sum = 0;
        while (n>0){
            sum += n;
            n--;
        }
        System.out.println("sum = " + sum);
    }
}
