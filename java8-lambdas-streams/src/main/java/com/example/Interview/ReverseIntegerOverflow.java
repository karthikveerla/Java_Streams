package com.example.Interview;

public class ReverseIntegerOverflow {
    public static void main(String[] args) {
        String s = "-12345628891";
        char sign = s.charAt(0);
        String resStr;
        if(sign == '-'){
            String digits = s.substring(1);
            resStr = "-" + new StringBuilder(digits).reverse().toString();
        }
        else {
            resStr = new StringBuilder(s).reverse().toString();
        }
        try {
            long val = Long.parseLong(resStr);
            if (val >= Integer.MIN_VALUE && val <= Integer.MAX_VALUE) {
                System.out.println((int) val);
            } else {
                System.out.println("Overflow: " + val);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid number: " + resStr);
        }
    }
}
