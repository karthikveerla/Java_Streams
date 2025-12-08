package com.example.Hard;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.example.dtos.Transaction;

public class HighestSpendDay {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
            new Transaction("T1",LocalDate.of(2025,12,7), 300),
            new Transaction("T2",LocalDate.of(2025,12,8), 600),
            new Transaction("T3",LocalDate.of(2025,12,9), 400),
            new Transaction("T4",LocalDate.of(2025,12,10), 200),
            new Transaction("T5",LocalDate.of(2025,12,11), 100),
            new Transaction("T6",LocalDate.of(2025,12,7), 600),
            new Transaction("T7",LocalDate.of(2025,12,10), 400),
            new Transaction("T8",LocalDate.of(2025,12,10), 800)
        );

        Map<LocalDate, Double> result = transactions.stream()
                    .collect(Collectors.groupingBy(
                        Transaction::getDate,
                        Collectors.summingDouble(Transaction::getAmount)
                        ));
        
        Map.Entry<LocalDate, Double> res = result.entrySet().stream()
                                                    .max(Map.Entry.comparingByValue())
                                                .orElseThrow();

        System.out.println(result);
        System.out.println(res);
    }
    
}
