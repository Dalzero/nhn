package com.nhnacademy.model;

public enum Category {
    WORK("WORK"), STUDY("STUDY"), PERSONAL("PERSONAL"), HEALTH("HEALTH"), OTHER("OTHER");

    private final String displayName;

    Category(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static Category 
}
