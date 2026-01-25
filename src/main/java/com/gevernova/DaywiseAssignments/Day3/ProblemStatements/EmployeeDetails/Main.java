package com.gevernova.DaywiseAssignments.Day3.ProblemStatements.EmployeeDetails;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public void processEmployees(List<Employee> employees) {


        List<Employee> filteredSorted =
                employees.stream()
                .filter(e -> "Engineering".equals(e.getDepartment()) && e.getSalary() > 80000)
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .collect(Collectors.toList());


        System.out.println("Filtered and Sorted: " + filteredSorted);


        Map<String, List<Employee>> groupedByDept =
                filteredSorted.
                        stream()
                .collect
                        (Collectors.groupingBy(Employee::getDepartment));

        System.out.println("Grouped by Dept: " + groupedByDept);


        Map<String, Double> avgSalaryPerDept =
                filteredSorted.
                        stream()
                .collect
                        (Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));

        System.out.println("Average Salaries: " + avgSalaryPerDept);
    }



    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "Engineering", 95000),
                new Employee(2, "Bob", "Engineering", 75000),
                new Employee(3, "Charlie", "Engineering", 120000),
                new Employee(4, "David", "HR", 90000)
        );

        Main main = new Main();
        main.processEmployees(employees);
    }
}
