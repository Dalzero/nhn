package com.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        Book book = new Book("Java 입문", 25000);
        book.getInfo();

        book.setPrice(30000);
        book.getInfo();

        Counter counter = new Counter();
        System.out.println(counter.getCount());
        counter.increment();
        System.out.println(counter.getCount());
        counter.increment();
        System.out.println(counter.getCount());

    }
}
