package com.example.Interview;

import java.util.*;
import java.util.Arrays;

public class CountAppearenceInSortedArray {

    public static int findFirst(List<Integer> list, int target){
        int result = -1;
        int left = 0, right = list.size();
        while(left<=right){
            int mid = (left+right)/2;
            if(list.get(mid)== target){
                result = mid;
                right = mid-1;
            }
            else if(list.get(mid)>target){
                right = mid -1;
            }
            else if(list.get(mid)<target){
                left = mid+1;
            }
        }
        return result;
    }


    public static int findLast(List<Integer> list, int target){
        int result = -1;
        int left = 0, right = list.size();
        while(left<=right){
            int mid = (left+right)/2;
            if(list.get(mid)== target){
                result = mid;
                left = mid+1;
            }
            else if(list.get(mid)>target){
                right = mid -1;
            }
            else if(list.get(mid)<target){
                left = mid+1;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,2,3,3,4,4,6,6,6,6,6,6,6,6,8,8,8,8,8,11,11,11,11,11);
        int target = 8;
        int first = findFirst(list,target);
        int last = findLast(list,target);
        System.out.println(last-first+1);
    }
}
