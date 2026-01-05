package com.example;

public class PhoneNumberNormalizer {
    public static void main(String[] args) {
        String[] phones = {
            "010-1234-5678",
            "010 1234 5678",
            "(010) 1234-5678",
            "010.1234.5678"
        };

        for (String phone : phones){
            String normalizer = phone.replace(" ", "-")
            .replace(".","-")
            .replace("(","")
            .replace(")","");
            System.out.println(normalizer);
        }
    }
}