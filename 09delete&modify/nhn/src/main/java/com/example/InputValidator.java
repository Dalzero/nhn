package com.example;

public class InputValidator{
    public static void main(String[] args) {
        String todoTitle = "  Java 공부  ";
        String url = "https://example.com/api";
        String filename = "report.pdf";

        todoTitle = todoTitle.trim();
        System.out.println("정제된 제목: " + todoTitle);
        
        if (todoTitle.contains("Java")){
            System.out.println("Java 관련 항목입니다.");
        }

        if (url.startsWith("https")){
            System.out.println("보안 연결 https입니다.");
        } else {
            System.out.println("비보안 연결입니다.");
        }
        if (filename.endsWith(".pdf")) {
            System.out.println("PDF 파일입니다.");
        } else if (filename.endsWith("csv")) {
            System.out.println("CSV 파일입니다.");
        } else {
            System.out.println("지원하지 않는 파일 형식입니다.");
        }
    }
}