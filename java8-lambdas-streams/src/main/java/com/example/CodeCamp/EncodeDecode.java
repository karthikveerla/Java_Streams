package com.example.CodeCamp;

import java.util.*;

public class EncodeDecode {

    public static String encode(List<String> data){
        if(data.size() == 0){
            return Character.toString((char)258);
        }
        StringBuilder sb = new StringBuilder();
        String sep = Character.toString((char) 257);
        for(String s:data){
            sb.append(s);
            sb.append(sep);
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
    public static List<String> decode(String s){
        if(s.equals(Character.toString((char)258))){
            return new ArrayList<>();
        }
        String sep = Character.toString((char) 257);
        return Arrays.asList(s.split(sep));
    }

    public static void main(String args[]){
        List<String> data = Arrays.asList("abc","123","xy","lmn");
        String p = encode(data);
        System.out.println(p);
        List<String> res = decode(p);
        System.out.println(res);
    }
}
