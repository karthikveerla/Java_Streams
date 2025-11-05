package com.example.Basic;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class FindDistinct {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        List<Integer> dnums = numbers.stream()
                                        .distinct()
                                        .collect(Collectors.toList());
        System.out.println(dnums);
    }
}
