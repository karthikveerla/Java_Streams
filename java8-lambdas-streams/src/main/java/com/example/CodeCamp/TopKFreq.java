package com.example.CodeCamp;

import java.util.*;

public class TopKFreq {


    public static int[] findfreq(int[] arr,int k){
        if(arr.length == k){
            return arr;
        }
        Map<Integer,Integer> freq = new HashMap<>();
        for(int i:arr){
            freq.put(i,freq.getOrDefault(i, 0)+1);
        }

        Queue<Integer> heap = new PriorityQueue<>((a,b)-> freq.get(a)-freq.get(b));
        for(int i:freq.keySet()){
            heap.add(i);
            if(heap.size()>k){
                heap.poll();
            }
        }
        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i] = heap.poll();
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,32,1,3,3,4,7,1,5,8,0,11,32,11};
        int k =3;
        System.out.println(Arrays.toString(findfreq(arr, k)));
    }
    
}
