package com.example.CodeCamp;

import java.util.Arrays;

public class SumOfArray {
    public static int[] getSum(int[] arr){
        int[] res = new int[arr.length];
        Arrays.fill(res,0);
        int pre =0,post =0;
        for(int i=0;i<arr.length;i++){
            res[i] = pre;
            pre = arr[i] + pre;
        }
        for(int i=arr.length-1;i>=0;i--){
            res[i] = post + res[i];
            post = post + arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};
        System.out.print(Arrays.toString(getSum(arr)));
    }
}
