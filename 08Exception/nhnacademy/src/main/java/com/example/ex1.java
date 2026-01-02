package com.example;

public class ex1 
{
    public static void main( String[] args )
    {
        String input = "abc";
        try{
            int number = Integer.parseInt(input);
            System.out.println("결과: " + number);
        }catch (NumberFormatException e){
            System.out.println("숫자 형식이 아닙니다");
        }
    }
}
