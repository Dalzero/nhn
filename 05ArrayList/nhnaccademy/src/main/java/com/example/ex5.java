package com.example;

import java.io.*;

public class ex5 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(reader.readLine());
        if(num >= 2 && num <= 9){
            for(int i = 1; i < 10; i++){
                System.out.println(num + " * " + i + " = " + num*i);
            }
        }else{
            throw new IllegalArgumentException("2와 9사이의 값을 입력하세요");
        }
    }
}
