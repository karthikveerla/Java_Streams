package com.example.Hard;

import java.util.*;
import java.util.stream.Collectors;

import com.example.dtos.CharCategory;

public class GroupCharacters {
    public static void main(String[] args) {
        List<Character> chs = Arrays.asList('A','v','5','/','R','T','f','[','0','o',')','O');
        Map<Object, List<Character>> res = chs.stream()
            .collect(Collectors.groupingBy(
                ch -> getCharType(ch.charValue())
            ));
        System.out.println(res);
    }
    private static Object getCharType(char c){
        if(Character.isUpperCase(c)) return CharCategory.UPPERCASE;
        if(Character.isLowerCase(c)) return CharCategory.LOWERCASE;
        if(Character.isDigit(c)) return CharCategory.DIGIT;
        return CharCategory.OTHER;
    }
}
