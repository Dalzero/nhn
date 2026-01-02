package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        CharMenu[] charmenu = CharMenu.values();
        for (CharMenu c : charmenu){
            System.out.print(c.getDisplayName() + " ");
        }
        
        int selectMenu = Integer.parseInt(reader.readLine());
        System.out.println(CharMenu.fromNumber(selectMenu).getDisplayName());

        
    }
}
