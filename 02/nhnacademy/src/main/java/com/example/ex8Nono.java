package com.example;

public class ex8Nono {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;

        System.out.println(a == b);
        System.out.println(c == d);
        /*
        true
        false

        -128 ~ 127은 캐싱이 되어 같은 객체를 참조하지만
        그 외의 값들은 새로운 객체를 생성하여 참조하기 때문에 false가 나온다.
        */
    }
}
