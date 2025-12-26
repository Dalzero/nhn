package com.example;

public class ex9Nono {
    public static void main(String[] args) {
        /*
        Integer value = null;
        int result = value + 10;
        */
       Integer value = null;
       int result = (value != null) ? value + 10 : 10;
       System.out.println(result);
    }
}
