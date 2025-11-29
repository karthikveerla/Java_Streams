package com.example.Intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.example.dtos.Employee;

public class DeptHaveMoreThanTwoEmp {
    public static void main(String args[]){
        List<Employee> emps = Arrays.asList(new Employee(1,"Alex","HR",3000),
                                            new Employee(2,"Bob","ITS",2000),
                                            new Employee(3,"Chris","HR",2500),
                                            new Employee(5,"Eric","ITS",2500),
                                            new Employee(6,"Fred","HR",2500),
                                            new Employee(7,"Greg","RD",2500),
                                            new Employee(8,"Hex","RD",2500),
                                            new Employee(9,"Ian","HR",2500),
                                            new Employee(10,"Jacob","HR",2500),
                                            new Employee(4,"David","ITS",1000));

    Map<String, Long> res =
        emps.stream()
            .collect(Collectors.groupingBy(
                Employee::getDept,
                Collectors.counting()
            ));
    List<String> result = res.entrySet().stream()
                            .filter(e-> e.getValue() > 2)
                            .map(Map.Entry::getKey)
                            .toList();

    System.out.println(result);
    }
}
