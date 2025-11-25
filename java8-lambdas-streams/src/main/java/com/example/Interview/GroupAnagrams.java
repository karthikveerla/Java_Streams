package com.example.Interview;

import java.util.*;
public class GroupAnagrams {


    public static List<List<String>> groupWords(String[] strs){
        Map<String,List<String>> result = new HashMap<>();
        for(String s: strs){
            int[] freq = new int[26];
            char[] letters = s.toCharArray();
            for(char c : letters){
                freq[c-'a']++;
            } 
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<26;i++){
                if(freq[i]>0){
                    sb.append((char)('a'+i)).append(freq[i]);
                }
            }
            String key=sb.toString();
            result.computeIfAbsent(key, k->new ArrayList<>()).add(s);
        }
        System.out.println(result.keySet());
        System.out.println(result);
        return new ArrayList<>(result.values());
    }

    public static void main(String[] args) {
        String[] words = {"ate","eat","tea","kate","take","tear","rate"};
        System.out.println(groupWords(words));
    }
    
}
