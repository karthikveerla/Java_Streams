package com.example.Basic;
import java.util.*; 
import java.util.stream.*; 
import java.util.Arrays;
import java.util.OptionalDouble;

public class AverageInt {
	 public static void main(String[] args) 
	    {
		 	List<Integer> nums = Arrays.asList(10,20,30,40,50);

			OptionalDouble avg = nums.stream()
										.mapToInt(Integer::intValue)
										.average();
			System.out.println(avg.getAsDouble());
	    } 

}
