package com.example.CodeCamp;
import java.util.Arrays;

public class TwoSum2 {

    //time complexity - O(n)
    //Space complexity - O(1)
    public static int[] findSum(int[] arr,int target){
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int sum = arr[left] + arr[right];
            if(sum>target){
                right--;
            }
            if(sum<target){
                left++;
            }
            if(sum==target){
                return new int[]{left,right};
            }
        }
        return new int[]{-1,-1};
    }


    //time complexity - O(nlogn)
    // public static int findPair(int l,int[] arr, int tar){
    //     int left = l;
    //     int right = arr.length-1;
    //     while(left<=right){
    //         int mid = left+(right-left)/2;
    //         if(arr[mid] == tar){
    //             return mid;
    //         }
    //         else if(arr[mid] > tar){
    //             right = mid-1;
    //         }
    //         else if(arr[mid] < tar){
    //             left = mid+1;
    //         }
    //     }
    //     return -1;
    // }

    // public static int[] findSum(int[] arr, int target){

    //     for(int i=0;i<arr.length-2 ;i++){
    //         int p = findPair(i+1,arr,target-arr[i]);
    //         if(p != -1){
    //             return new int[]{i,p};
    //         }
    //     }

    //     return new int[]{-1,-1};
    // }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,6,10,12,23,32,42,87,94};
        int target = 99;
        System.out.println(Arrays.toString(findSum(arr,target)));
    }
}
