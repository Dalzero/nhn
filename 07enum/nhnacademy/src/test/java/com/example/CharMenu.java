package com.example;

public enum CharMenu {
    Info("정보"),
    Status("스탯"),
    Skill("기술"),
    Inventory("창고"),
    Equip("장비");

    private final String displayName;

    CharMenu(String displayName){
        this.displayName=displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static CharMenu fromNumber(int number){
        if(number < 1 || number > values().length){
            throw new IllegalArgumentException("잘못된 구분 번호: " + number);
        }
        return values()[number -1];
    }    
}

