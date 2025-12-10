package com.example.Hard;

import com.example.dtos.Employee;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeWith3Dept {
    public static void main(String[] args) {
        List<Employee> rec = List.of(
            new Employee(1,"Alex","HR",3000),
            new Employee(1,"Alex","ITS",3000),
            new Employee(1,"Alex","RD",3000),
            new Employee(2,"Bob","ITS",2000),
            new Employee(3,"Chris","HR",2500),
            new Employee(5,"Eric","ITS",2500),
            new Employee(6,"Fred","HR",2500),
            new Employee(7,"Greg","RD",2500),
            new Employee(8,"Hex","RD",2500),
            new Employee(8,"Hex","ITS",2500),
            new Employee(8,"Hex","HR",2500),
            new Employee(9,"Ian","HR",2500),
            new Employee(10,"Jacob","HR",2500),
            new Employee(4,"David","ITS",1000)
        );
        Map<String,List<Employee>> res = rec.stream()
            .collect(Collectors.groupingBy(
                Employee::getName));
        List<String> result = res.entrySet().stream()
                                .filter(e -> e.getValue().size() >= 3)
                                .map(Map.Entry::getKey)
                                .toList();

        System.out.println(result);
    }
}
