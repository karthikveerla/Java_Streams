package com.example.Hard;

import java.util.*;
import java.util.stream.Collectors;


public class ReverseEachWord {
    public static void main(String[] args) {
        String sen = "In backend Basically we develop restful apis using Spring MVC architecture connecting it to database using Data JPA and implement security using Spring security";
        String res = Arrays.stream(sen.split(" "))
              .map(word->new StringBuilder(word).reverse().toString())
              .collect(Collectors.joining(" "));

        String result = Arrays.stream(sen.split(" "))
              .map(word->Arrays.stream(word.split(""))
                .reduce("",(rev,ch)->ch+rev))
              .collect(Collectors.joining(" "));
        System.out.println(res);
        System.out.println(result);
    }
}
