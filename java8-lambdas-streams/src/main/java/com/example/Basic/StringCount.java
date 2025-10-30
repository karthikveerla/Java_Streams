package main.java.com.example.Basic;
import java.util.*;
import java.util.stream.*;

public class StringCount {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Aakash","Binod","Charles","Arun","david");

        long count = names.stream()
                                    .filter(a -> a.startsWith("A") || a.startsWith("C"))
                                    .count();
        System.out.println(count);

    }
}
