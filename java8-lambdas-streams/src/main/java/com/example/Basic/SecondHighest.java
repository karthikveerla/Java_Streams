package main.java.com.example.Basic;
import java.util.*;
import java.util.stream.*;

public class SecondHighest {
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(99,23,54,76,45,86,93,45,13);
        Optional<Integer> sec = marks.stream()
                        .sorted(Comparator.reverseOrder())
                        .skip(1)
                        .findFirst();
        System.out.println(sec.get());
    }
}
