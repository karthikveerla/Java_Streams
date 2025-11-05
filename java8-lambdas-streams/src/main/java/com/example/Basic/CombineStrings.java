package com.example.Basic;
import java.util.*;
import java.util.stream.*;

public class CombineStrings {
    public static void main(String[] args) {
        
        List<String> str = Arrays.asList("Apple","Ball","Car","Disco","Elephant","Ferry","Ginger");
        String result = str.stream()
                            .collect(Collectors.joining(",","[","]"));
        System.out.println(result);
    }
}
