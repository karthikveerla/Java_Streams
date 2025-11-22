package com.example.Intermediate;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;

public class GroupByLength {
    public static void main(String[] args) {
        List<String> strs = Arrays.asList("Adam","Bob","Chris","David","Eric","Faizal","Greg","Harrison","Ian","John","Kelly","Louis","Mark","Nick","Olivia","Peter","Quillan","Ryan","Steven","Tom","Umar","Victor","William","Xavier","Yates","Zoe");
        Map<Integer,List<String>> res = strs.stream()
                                            .collect(Collectors.groupingBy(String::length));
        System.out.println(res);
    }
}
