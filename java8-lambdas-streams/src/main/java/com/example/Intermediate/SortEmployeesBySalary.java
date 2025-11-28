package com.example.Intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.example.dtos.Employee;

public class SortEmployeesBySalary {
    public static void main(String[] args) {
        List<Employee> emplist = Arrays.asList(
            new Employee(100,"John","", 20000),
            new Employee(102,"devin", "", 25000),
            new Employee(200,"Sai","",15000 )
        );

        List<Employee> re =  emplist.stream()
                            .sorted(Comparator.comparing(Employee::getSalary))
                            .toList();
        for(Employee e: re){
            System.out.println(""+e.getId()+""+e.getName()+""+e.getSalary());
        }
        
    }
}
