package com.nhnacademy.model;

public enum Priority {
    LOW(1, "LOW", "★☆☆"), MEDIUM(2, "MEDIUM", "★★☆"), HIGH(3, "HIGH", "★★★");

    private final int level;
    private final String displayName;
    private final String stars;

    Priority(int level, String displayName, String stars) {
        this.level = level;
        this.displayName = displayName;
        this.stars = stars;
    }

    public int getLevel() {return level;}

    public String getDisplayName() {return displayName;}

    public String getStars() {return stars;}

    // 숫자로 enum 찾기
    public static Priority fromLevel(int level) {
        for (Priority p : values()) {
            if (p.level == level) {
                return p;
            }
        }
        throw new IllegalArgumentException("잘못된 중요도: " + level);
    }
}
