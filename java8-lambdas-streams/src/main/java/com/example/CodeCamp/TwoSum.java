package com.example.CodeCamp;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] findpair(int[] arr, int target){
        HashMap<Integer,Integer> med = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int com = target-arr[i];
            if(med.containsKey(com)){
                return new int[]{med.get(com),i};
            }
            med.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] arr = new int[]{4,3,5,2,8,10};
        int target = 21;
        System.out.println(Arrays.toString(findpair(arr,target)));
    }
    
}
