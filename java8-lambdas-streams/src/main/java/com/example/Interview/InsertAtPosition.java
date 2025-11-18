package com.example.Interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InsertAtPosition {
    public static int findPosition(List<Integer> list,int num){
        int pos = Collections.binarySearch(list,num);
        if(pos<0) 
            pos = -pos - 1;
        return pos;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,4,6,9);
        int num =10;
        System.out.println(findPosition(list,num));
    }
    
}
