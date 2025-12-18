package com.example.CodeCamp;

public class IsPalindrome {

    public static boolean isPal(String s){
        int l = 0;
        int r = s.length()-1;
        while(l<r){
            char cl = s.charAt(l);
            char cr = s.charAt(r);
            if(!Character.isLetterOrDigit(cl)){
                l++;
                continue;
            }
            if(!Character.isLetterOrDigit(cr)){
                r--;
                continue;
            }
            if(Character.toLowerCase(cl)==Character.toLowerCase(cr)){
                l++;
                r--;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a cana: Panama";
        System.out.println(isPal(s));
    }
    
}
