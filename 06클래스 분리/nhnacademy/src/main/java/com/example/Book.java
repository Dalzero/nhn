package com.example;

public class Book
{
    private String title;
    private int price;

    public Book(String title, int price){
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void getInfo() {
        System.out.println(getTitle() + " - " + getPrice() + "원");
    }
}
