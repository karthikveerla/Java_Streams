package main.java.com.example;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
public class FilterStrings 
{
	public static List<String> filter(List<String> list) 
	{
		return list.stream().filter(s -> s.startsWith("a") && s.length()==3).collect(Collectors.toList());
	}
	public static void main(String args[]) 
	{
		List<String> strings = new ArrayList<String>();
		 strings.add("abc"); 
	        strings.add("aaa"); 
	        strings.add("bbb");
	        strings.add("abcd");
	        List<String> s = filter(strings); 
	        System.out.println(s);	
	}
}