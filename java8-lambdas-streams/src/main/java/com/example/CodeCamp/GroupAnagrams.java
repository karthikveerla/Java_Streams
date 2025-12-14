package com.example.CodeCamp;

import java.util.*;

public class GroupAnagrams {

    static List<List<String>> makeGroups(List<String> l){
        Map<String,List<String>> grp = new HashMap<>();
        int[] count = new int[26];

        for(String s: l){
            Arrays.fill(count,0);
            for(char c:s.toCharArray()){
                count[c-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<26;i++){
                if(count[i]!=0){
                    sb.append((char)(i+97));
                    sb.append(count[i]);
                }
            }
            String k = sb.toString();
            grp.computeIfAbsent(k, e->new ArrayList<>()).add(s);
        }
        return new ArrayList<>(grp.values());
    }

    public static void main(String[] args) {
        //LEETCODE-49
        List<String> l = Arrays.asList("rat","ate","eat","tea","tar","cat","chat","tac");
        // makeGroups(l);
        System.out.println(makeGroups(l));
    }
    
}
