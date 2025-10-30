package main.java.com.example;

import java.util.*;
import java.util.stream.*;

public class Sorting {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 2);

        List<Integer> asl = numbers.stream()
                                    .sorted()
                                    .toList();


        List<Integer> dsl = numbers.stream()
                                    .sorted(Comparator.reverseOrder())
                                    .collect(Collectors.toList());
        System.out.println("Ascending Order: "+asl);
        System.out.println("Descending Order: "+dsl);
    }
}
