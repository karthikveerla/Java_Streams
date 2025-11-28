package com.example.Intermediate;

import java.util.*;
import java.util.stream.Collectors;

import com.example.dtos.Employee;


public class HighestPaidByDepartment {
    public static void main(String args[]){
        List<Employee> emps = Arrays.asList(new Employee(1,"Alex","HR",3000),
                                            new Employee(2,"Bob","ITS",2000),
                                            new Employee(3,"Chris","HR",2500),
                                            new Employee(4,"David","ITS",1000));

Map<String, Employee> res =
        emps.stream()
            .collect(Collectors.groupingBy(
                Employee::getDept,
                Collectors.collectingAndThen(
                    Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
                    Optional::get
                )
            ));

        System.out.println(res);
    }
}
