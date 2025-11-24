package com.example.Interview;
import java.util.*;

public class Anagrams {
    public static void main(String Args[]){
        String s1 = "loyal";
        String s2 = "layola";
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.equals(a,b));
    }
}
