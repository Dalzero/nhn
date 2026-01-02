package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ex5
{
    public static void main( String[] args ) {
        try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))){
            String line = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
