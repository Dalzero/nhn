package com.example;

public class Timer {
    private long startTime;

    public void start() {
        startTime = System.currentTimeMillis();
        System.out.println("타이머 시작");
    }

    public void stop() {
        long elapsed = System.currentTimeMillis() - startTime;
        System.out.println("타이머 종료: " + elapsed + "ms");
    }

    public int processData(int[] data) {
    
        Timer timer = new Timer();
        timer.start();
        
        try{
            int sum = 0;
            for (int value : data) {
                if (value < 0) {
                    throw new IllegalArgumentException("음수 데이터: " + value);
                }
                sum += value;
            }
            return sum;
        } finally {
            timer.stop();
        }
    }
}

