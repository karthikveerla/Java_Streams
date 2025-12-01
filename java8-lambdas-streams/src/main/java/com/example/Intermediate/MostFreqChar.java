package com.example.Intermediate;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MostFreqChar {
    public static void main(String[] args) {
        String str = "programmatically";
        Map.Entry<Character,Long> res = str.chars()
                                .mapToObj(c -> (char) c)
                                .collect(Collectors.groupingBy(
                                    Function.identity(),
                                    Collectors.counting()
                                ))
                            .entrySet().stream()
                            .max(Map.Entry.comparingByValue())
                            .orElseThrow();
        System.out.println(res);
    }
}
