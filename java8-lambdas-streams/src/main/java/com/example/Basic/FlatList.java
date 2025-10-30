package main.java.com.example.Basic;

import java.util.*;
import java.util.stream.*;

public class FlatList {
    public static void main(String[] args) {
        List<List<Integer>> l = Arrays.asList(Arrays.asList(1,2,3),
                Arrays.asList(2,3,4));

        List<Integer> result = l.stream()
                                .flatMap(List::stream)
                                .toList();
        System.out.println(result);

    }
}
