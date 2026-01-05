package com.example;

public class MessageBuilder {
    public static void main(String[] args) {
        String msg1 = buildMessage("Java 공부", null, null);
        System.out.println(msg1);

        String msg2 = buildMessage(null, "STUDY", true);
        System.out.println(msg2);

        String msg3 = buildMessage("프로젝트 마무리", "WORK", false);
        System.out.println(msg3);
    }

    public static String buildMessage(String title, String category, Boolean done) {
        return null;
    }
}