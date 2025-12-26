package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ex11 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("이름 : ");
        String name = reader.readLine();
        System.out.println("입력한 이름 : " + name);

    }
}
