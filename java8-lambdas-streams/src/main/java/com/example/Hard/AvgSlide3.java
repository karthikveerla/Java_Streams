package com.example.Hard;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class AvgSlide3 {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(2,4,12,34,12,43);
        int win = 3;
        // List<Double> res = IntStream.range(0,(int)(li.size()-(win-1)))
        //             .mapToObj(i->(li.get(i)+li.get(i+1)+li.get(i+2))/win)
        //             .toList();
        List<Double> res = IntStream.range(0,li.size()-(win-1))
                    .mapToObj(i->li.subList(i, i+win))
                    .map(wi -> wi.stream()    
                            .mapToInt(Integer::intValue)
                            .average()
                            .orElse(.0))
                            .toList();
        System.out.println(res);
    }
}
