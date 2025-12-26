package com.example;

public class ex4Nono {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        a = 20;
        System.out.println("a = " + a + ", b = " + b);

        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1;
        arr1[0] = 100;
        System.out.println("arr1[0] = " + arr1[0] + ", arr2[0] = " + arr2[0]);
        // a = 20, b = 10
        // arr1[0] = 100, arr2[0] = 100
    }
}
