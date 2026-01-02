package com.example;

public class Counter
{   
    private int count = 0;
    private boolean locked = false;

    public void lock() {
        locked = true;
        System.out.println("잠금 시작");
    }

    public void unlock() {
        locked = false;
        System.out.println("잠금 해제");
    }

    public void increment(int value) {
        lock();

        try{
            if (value < 0) {
                throw new IllegalArgumentException("음수는 허용되지 않습니다.");
            }
            count += value;
            System.out.println("현재 값: " + count);
        } finally {
            unlock();
        }
    }   
}
