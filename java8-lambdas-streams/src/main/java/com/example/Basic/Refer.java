package com.example.Basic;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class Refer {
	public static void main(String[] args) {
        List<String> a = Arrays.asList("14561","12221","1222344321","malayalam","010","12212221");
        List<String> palindrome = Refer.findPal(a,(str) -> Refer.isPalindrome((String) str));
        System.out.println("Palindromes are " + palindrome);
    }
    public static boolean isPalindrome(String str) 
    {
    	StringBuffer sb =new StringBuffer();
    	for(int i = sb.length()-1; i >= 0 ; i--) 
    	{
    	sb = sb.append(str.charAt(i));
    	}
    	if(str.equalsIgnoreCase(sb.toString())) 
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
        } 
    public static List<String> findPal(List<String> list, Predicate<String> predicate) { 
    	List<String> sorted = new ArrayList<String>(); 
    	list
    	.stream()
    	.filter((i) -> (predicate.test((String) i))).forEach((i) -> {
            sorted.add((String) i);
        });
        return sorted;
 
    }
    
}
