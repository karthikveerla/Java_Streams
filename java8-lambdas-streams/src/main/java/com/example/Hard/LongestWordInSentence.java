package com.example.Hard;

import java.util.Arrays;
import java.util.Comparator;

public class LongestWordInSentence {
    public static void main(String[] args) {
        String sen = "Docker is used to make containers of a project for easy dependency management, faster deployment, consistent enviroment";
        String word = Arrays.stream(
            sen.toLowerCase()
            .replaceAll("[^a-z\\s]", "")
            .split(" "))
            .max(Comparator.comparing(String::length))
            .orElse("sen");
        System.out.println(word);
    }
    
}
