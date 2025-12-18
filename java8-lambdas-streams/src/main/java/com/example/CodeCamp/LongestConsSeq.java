package com.example.CodeCamp;

import java.util.*;


//time complexity - O(n)
//Space COmplexity - O(n)
public class LongestConsSeq {

    public static int findSeqLength(int[] arr){
        if(arr.length == 0){
            return 0;
        }
        if(arr.length == 1){
            return 1;
        }
        HashSet<Integer> hs = new HashSet<>();
        for(int i:arr){
            hs.add(i);
        }
        int lcs = 1;
        for(int num: hs){
            if(hs.contains(num-1)){
                continue;
            }
            else{
                int curNum = num;
                int curSub = 1;
                while(hs.contains(curNum+1)){
                    curSub++;
                    curNum++;
                }
                lcs = Math.max(lcs, curSub);
            }
        }
        return lcs;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{99,7,100,0,4,6,3,5,200,-1};
        System.out.print(findSeqLength(arr));
    }
}
