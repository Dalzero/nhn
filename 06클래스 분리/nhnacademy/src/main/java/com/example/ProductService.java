package com.example;

import java.util.ArrayList;

public class ProductService {
    private ArrayList<Product> ProductList = new ArrayList<>();

    public void add(Product product){
        ProductList.add(product);
    }

    public ArrayList<Product> getAll(){
        return ProductList;
    }

    public int count(){
        return ProductList.size();
    }

}