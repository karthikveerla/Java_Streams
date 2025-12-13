package com.example.CodeCamp;
public class ValidAnagram {
    public static boolean ana(String a,String b){
        int[] arr = new int[26];
        if(a.length()!=b.length()){
            return false;
        }
        else{
            for(int i=0;i<a.length();i++){
                arr[a.charAt(i)-'a']++;
                arr[b.charAt(i)-'a']--;
            }
            for(int i: arr){
                if(i!=0){
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        String a = "cat";
        String b = "act";
        System.out.println(ana(a,b));
    }
}
