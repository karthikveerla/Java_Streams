package com.example.Hard;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFreqWords {
    public static void main(String[] args) {
        String pg = "optional, Optional is a container of object that may or may of of not contain a value. Instead of returning null, methods can return an Optional to indicate the presence or absence of data in a predictable way.";
        Map<String,Long> words = Arrays.stream(
                                        pg.toLowerCase()
                                        .replaceAll("[^a-z\\s]", "")
                                        .split(" "))
                                        .collect(Collectors.groupingBy(
                                            Function.identity(),
                                            Collectors.counting()
                                        ));
        System.out.println(words);    
        List<Map.Entry<String,Long>> res_sort = words.entrySet().stream()   
                        .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                        .toList();
        
        List<Long> topfreq = res_sort.stream()
                                    .map(Map.Entry::getValue)
                                    .distinct()
                                    .limit(3)
                                    .toList();

        List<Map.Entry<String,Long>> res = res_sort.stream()
                .filter(e -> topfreq.contains(e.getValue()))
                .toList();
        // System.out.println(res);
    }
}
