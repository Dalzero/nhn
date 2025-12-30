package com.nhnacademy.model;

public enum Category {
    WORK("WORK"), STUDY("STUDY"), PERSONAL("PERSONAL"), HEALTH("HEALTH"), OTHER("OTHER");

    private final String displayName;

    Category(String displayName) {this.displayName = displayName;}

    public String getDisplayName() {return displayName;}

    public static Category ReadNumber(int number) {
        if (number < 1 || number > values().length) {
            throw new IllegalArgumentException("유효한 카테고리 번호를 입력하세요.");
        }
        return values()[number - 1];
    }
}
