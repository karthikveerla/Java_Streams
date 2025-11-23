package com.example.Interview;

import java.util.HashSet;
import java.util.*;

public class LongestSubstringWithoutRepeat {
    public static void main(String[] args) {
        String s = "Encyclopedia";
        Set<Character> visit = new HashSet<>();
        int left = 0, maxlen = 0,start=0;
        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);

            while(visit.contains(c)){
                visit.remove(s.charAt(left));
                left++;
            }
            visit.add(c);
            if(maxlen < right-left+1){
                start = left;
                maxlen = right-left+1;
            }
            // maxlen = Math.max(maxlen,right-left+1);  //if we need just length
        }
        System.out.println(s.substring(start,start+maxlen));
        System.out.println(maxlen);
    }
}
