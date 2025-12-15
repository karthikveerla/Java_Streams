package com.example.CodeCamp;

import java.util.Arrays;

public class ProductOfArray {
    public static int[] getProd(int[] arr){
        int[] res = new int[arr.length];
        Arrays.fill(res,1);
        int pre =1,post =1;
        for(int i=0;i<arr.length;i++){
            res[i] = pre;
            pre = arr[i] * pre;
        }
        System.out.println(Arrays.toString(res));
        for(int i=arr.length-1;i>=0;i--){
            res[i] = post * res[i];
            post = post * arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};
        System.out.print(Arrays.toString(getProd(arr)));
    }
    
}
