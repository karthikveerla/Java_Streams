package com.example.Hard;
import java.util.*;

public class StreamOptional {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sukku", "Karthik", "Rohith", "Varun");

        // Find the first name that starts with "P"
        Optional<String> firstWithP = names.stream()
                                           .filter(name -> name.startsWith("P"))
                                           .findFirst();

        // Using Optional methods
        firstWithP.ifPresentOrElse(
            name -> System.out.println("Found: " + name),
            () -> System.out.println("No match found")
        );

        // Example with map
        Optional<Integer> nameLength = names.stream()
                                            .filter(name -> name.startsWith("R"))
                                            .findFirst()
                                            .map(String::length);

        System.out.println("Length of first name starting with R: " + nameLength.orElse(-1));
    }
}