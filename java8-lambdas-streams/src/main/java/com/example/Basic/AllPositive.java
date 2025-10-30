package main.java.com.example.Basic;

import java.util.*;
import java.util.stream.*;
public class AllPositive {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,4,10,-5);
        boolean result = nums.stream()
                              .anyMatch(a-> a>0);
        System.out.println(result);
    }
}
