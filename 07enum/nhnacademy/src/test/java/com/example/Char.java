package com.example;

public class Char {
    private String name;
    private String job;
    private int Hp;
    private int power;

    public Char(String name, String job, int Hp, int power){
        this.name = name;
        this.job = job;
        this.Hp = Hp;
        this.power = power;
    }

    public int getHp() {
        return Hp;
    }
    public String getJob() {
        return job;
    }
    public String getName() {
        return name;
    }
    public int getPower() {
        return power;
    }

    public void setHp(int hp) {
        Hp = hp;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPower(int power) {
        this.power = power;
    }

    public void ataak(Enermy target){
        int newHp = target.getHp() - (this.power * 2);
        target.setHp(newHp);
    }
}
