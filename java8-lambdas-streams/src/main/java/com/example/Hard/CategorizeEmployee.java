package com.example.Hard;

import java.util.*;
import java.util.stream.Collectors;

import com.example.dtos.Employee;
import com.example.dtos.SalaryRange;

public class CategorizeEmployee {
    public static void main(String[] args) {
        List<Employee> emps = Arrays.asList(
            new Employee(1, "Alex", "D1", 42000),
            new Employee(2,"Brinda","D1",49500),
            new Employee(3,"Charles","D2",65000),
            new Employee(4,"David","D3",64000),
            new Employee(3, "Ethan", "D3", 120000)
        );
        Map<SalaryRange,List<Employee>> res = emps.stream()
            .collect(Collectors.groupingBy(
                e -> getSalaryRange(e.getSalary())
            ));
        System.out.println(res);
    }

    private static SalaryRange getSalaryRange(Double sal){
        if(sal<50000) return SalaryRange.LOW;
                    if(sal <100000) return SalaryRange.MEDIUM;
                    else return SalaryRange.HIGH;
    }
}
