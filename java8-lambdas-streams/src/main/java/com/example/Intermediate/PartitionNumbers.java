package com.example.Intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

public class PartitionNumbers {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,6,12,34,23);
        Map<Boolean,List<Integer>> result = nums.stream()
                                                .collect(Collectors.partitioningBy(n->n%2==0));
        System.out.println(result.get(false));
    }
}
