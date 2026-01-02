package com.example.academy.todo.model;

public enum Priority {
    LOW(1, "낮음", "★☆☆"),
    MEDIUM(2, "보통", "★★☆"),
    HIGH(3, "높음", "★★★");

    private final int level;
    private final String displayName;
    private final String stars;

    Priority(int level, String displayName, String stars) {
        this.level = level;
        this.displayName = displayName;
        this.stars = stars;
    }

    public int getLevel() {
         return level;
    }
    public String getDisplayName() { 
        return displayName;
    }
    public String getStars() {
        return stars;
    }

    public static Priority fromNumber(int level) {
        for (Priority p : values()) {
            if (p.level == level) {
                return p;
            }
        }
        throw new IllegalArgumentException("잘못된 중요도: " + level);
    }
}