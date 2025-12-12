package com.example.CodeCamp;

import java.util.HashSet;

public class ContainDuplicates {
    
    public static boolean containDup(int[] nums){
        HashSet<Integer> seen = new HashSet<>();
        for(int i:nums){
            if(seen.contains(i)){
                return false;
            }
            seen.add(i);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,4,3};
        System.out.println(containDup(arr));
    }
}
