package com.gevernova.DaywiseAssignments.Day3.ProblemStatements.EmployeeDetails;

class Employee {

    int id; String name, department; double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {

        return department;
    }

    public double getSalary() {

        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}

