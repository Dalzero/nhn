package com.example;

public class UrlSlugGenerator {
    public static void main(String[] args) {
        String title = "  Hello World Java Programming  ";
        
        String slug =title = title.trim()
        .replace(" ", "-")
        .toLowerCase();

        System.out.println("원본: " + title);
        System.out.println("슬러그: " + slug);

        String[] titles = {
            "  Java Tutorial  ",
            "Spring Boot Guide",
            "  Clean Code Practices  "
        };

        for(String gettitles : titles){
            String slugtitles = gettitles.trim()
            .replace(" ", "-")
            .toLowerCase();
            System.out.println(gettitles + " -> " + slugtitles);
        }
    }
}
