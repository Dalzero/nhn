package com.nhnacademy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main   
{
    public static void main( String[] args ) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.println("\n=== TODO 앱 ===");
                System.out.println("1. 등록");
                System.out.println("2. 조회");
                System.out.println("0. 종료");
                System.out.print("선택 > ");
                
                String input = reader.readLine();

                switch (input) {
                    case "0" -> {System.out.println("프로그램 종료"); return;}
                    case "1" -> System.out.println("1. 등록 메뉴 선택됨");
                    case "2" -> System.out.println("2. 조회 메뉴 선택됨");
                    default -> System.out.println("잘못된 입력입니다.");
                };
            }
        }
    }
}
