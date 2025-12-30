package com.example;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class ex2 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum=0;

        System.out.print("시작: ");
        int a = Integer.parseInt(reader.readLine());

        System.out.print("끝: ");
        int b = Integer.parseInt(reader.readLine());

        for(int i = a; i <= b ; i++) {
            sum += i;
        }

        System.out.println("합계: " + sum);
    }
}
