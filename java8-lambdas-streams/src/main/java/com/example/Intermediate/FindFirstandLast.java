package com.example.Intermediate;

import java.util.Arrays;
import java.util.*;
import java.util.stream.*;

public class FindFirstandLast {

    public static int findpos(List<Integer> arr, int tar){
        int a=0,b=1;
        a = IntStream.range(0,arr.size())
                .filter(x -> arr.get(x)==tar )
                .findFirst()
                .orElse(0);
        b = IntStream.range(0,arr.size())
                .filter(x -> arr.get(x)==tar )
                .reduce((x,y)->y)
                .orElse(0);
        return b;
    }

    public static void main(String[] args) {
        List<Integer> arr =Arrays.asList(1,2,2,3,3,3,3,3,4,5,5,5,6);
        int tar = 5;
        System.out.println(findpos(arr,tar));
    }
}
