package com.example.Intermediate;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.*;

public class CountOccurences {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple","banana","kiwi","banana","kiwi","peach","kiwi","apple","banana","kiwi");
        Map<String, Long> res = fruits.stream()
                                        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(res);
    }
}
