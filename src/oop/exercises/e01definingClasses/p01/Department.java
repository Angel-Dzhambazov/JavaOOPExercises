package oop.exercises.e01definingClasses.p01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Department {
    private List<Employee> employeeList = new ArrayList<>();
    private Double averageSalary;
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public void addEmployee(Employee employee) {
        this.employeeList.add(employee);
    }

    public Double getAverageSalary() {
        this.averageSalary = 0.0;
        for (Employee employee : employeeList) {
            averageSalary += employee.getSalary();
        }
        return this.averageSalary / employeeList.size();
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append(String.format("Highest Average Salary: %s", this.name)).append(System.lineSeparator());

        this.employeeList.stream().sorted((e1, e2) -> e2.getSalary().compareTo(e1.getSalary()))
                .collect(Collectors.toList())
                .forEach(e1 -> output.append(e1.toString()).append(System.lineSeparator()));
        return output.toString();
    }
}
