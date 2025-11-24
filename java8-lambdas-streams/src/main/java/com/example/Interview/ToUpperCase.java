package com.example.Interview;

public class ToUpperCase {
    public static void main(String[] args) {
        String str = "karthik veerla";
        StringBuilder result = new StringBuilder();
        for(char ch: str.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                result.append((char)(ch-32));
            }
            else{
                result.append(ch);
            }
        }
        System.out.println(result);
    }
}
