package main.java.com.example.Basic;

import java.util.*;
import java.util.stream.*;
public class NonEmptyString {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("","Hello","","World","","work");
        Optional<String> result = str.stream()
                            .filter(s -> !s.isEmpty())
                            .findFirst();
        System.out.println(result.get());
    }
}
