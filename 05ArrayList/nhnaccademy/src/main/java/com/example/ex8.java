package com.example;

import java.util.ArrayList;

public class ex8 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();

        name.add("Alice");
        name.add("Bob");
        name.add("Charlie");

        for(String names : name){
            System.out.println("Hello " + names + "!");
        }
    }
}
