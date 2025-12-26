package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ex12 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("나이 : ");
        String name = reader.readLine();
        int age = Integer.parseInt(name);
        System.out.println("입력한 나이 : " + age);
    }
}
