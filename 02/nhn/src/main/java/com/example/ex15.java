package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class ex15 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputText;
        while (true) {
            System.out.print("숫자를 입력하세요 (종료: quit) > ");
            inputText = reader.readLine();
            if (inputText.equals("quit")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
