package com.example.Hard;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.*;
import java.util.function.Function;

public class BigramFreq {
    public static void main(String[] args) {
        String pg = "Java is great, Java is fun and java is grateful";

        String[] words = pg.toLowerCase().replaceAll("[^a-z\\s]" , "")
        .split(" ");

        List<String> mid = IntStream.range(0,words.length-1)
                .mapToObj(i->words[i]+" "+words[i+1])
                .toList();

        Map.Entry<String,Long> res = mid.stream()
                                    .collect(Collectors.groupingBy(
                                        Function.identity(),
                                        Collectors.counting()
                                    )).entrySet().stream()
                                    .max(Map.Entry.comparingByValue())
                                    .orElseThrow();

        System.out.println(res);
    }
}
