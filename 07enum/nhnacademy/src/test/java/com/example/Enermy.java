package com.example;

public class Enermy extends Char{
    private int dropexp;

    public Enermy(String name, String jobm, int Hp, int power, int dropexp){
        super(name, jobm, Hp, power);
        this.dropexp = dropexp;
    }

    public void setDropexp(int dropexp) {
        this.dropexp = dropexp;
    }
}
