package com.example.academy.todo.model;

public enum Category {
    WORK("업무"), STUDY("학습"), PERSONAL("개인"), HEALTH("건강"), OTHER("기타");

    private final String displayName;

    Category(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getvaluelength(){
        return values().length;
    }

    public static Category fromNumber(int number) {
        if (number < 1 || number > values().length) {
            throw new IllegalArgumentException("잘못된 구분 번호: " + number);
        }
        return values()[number - 1];
    }
}