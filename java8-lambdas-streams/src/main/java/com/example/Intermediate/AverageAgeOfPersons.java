package com.example.Intermediate;

import java.util.Arrays;
import java.util.List;

import com.example.dtos.Person;

public class AverageAgeOfPersons {
    public static void main(String[] args) {
        List<Person> p = Arrays.asList(new Person("alice",35),
                                    new Person("Bob", 45),
                                    new Person("Chris",40),
                                    new Person("David",36));


           double avgage = p.stream()
             .mapToInt(Person::getAge)
             .average()
             .orElse(0.0);
             System.out.println(avgage);
    }
    
}
