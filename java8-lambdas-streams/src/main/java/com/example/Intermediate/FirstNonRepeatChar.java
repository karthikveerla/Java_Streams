package com.example.Intermediate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatChar {
        public static void main(String[] args) {
        String str = "programmatically";
        Optional<Map.Entry<Character,Long>> res = str.chars()
                                .mapToObj(c -> (char) c)
                                .collect(Collectors.groupingBy(
                                    Function.identity(),
                                    LinkedHashMap:: new,
                                    Collectors.counting()
                                )).entrySet().stream()
                                .filter(entry->entry.getValue()==1)
                                .findFirst();
        System.out.println(res);
    }
}
