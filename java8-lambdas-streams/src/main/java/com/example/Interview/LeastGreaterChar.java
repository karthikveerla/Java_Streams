package com.example.Interview;
import java.util.*;

import java.util.Arrays;

public class LeastGreaterChar {

    public static char findchar(List<Character> list, char target){
        int l =0;
        int r = list.size() - 1;
        while(l<=r){
            int mid = (l+r)/2;
            if(target > list.get(mid)){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return list.get(l);
    }

    public static void main(String[] args) {
        List<Character> list = Arrays.asList('a','b','g','k','q','r');
        char k = 'i';
        System.out.println(findchar(list,k));
    }
}
