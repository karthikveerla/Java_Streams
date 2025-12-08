package com.example.dtos;

public class Employee {
    private int id;
    private String name;
    private double Salary;
    private String dept;
    public Employee(int id, String name, String dept,  double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.Salary = salary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept){
        this.dept = dept;
    }

    public String getDept(){
        return dept;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", Salary=" + Salary + ", dept=" + dept + "]";
    }
    public double getSalary() {
        return Salary;
    }
    public void setSalary(Long salary) {
        Salary = salary;
    }
}
