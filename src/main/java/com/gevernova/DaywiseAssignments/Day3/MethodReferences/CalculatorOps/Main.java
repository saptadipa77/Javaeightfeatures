package com.gevernova.DaywiseAssignments.Day3.MethodReferences.CalculatorOps;

public class Main {
    public static void main(String[] args) {
        OperationLibrary lib = new OperationLibrary();

        // Assigning method references to the functional interface
        Calculator<Integer,Integer> addition = lib::add;
        Calculator<Integer,Integer> subtraction = lib::subtract;
        Calculator<Integer,Integer> multiplication = lib::multiply;
        Calculator<Integer,Integer> division = lib::divide;

        // Testing the implementation
        System.out.println("Addition: " + addition.calculate(10, 5));
        System.out.println("Subtraction: " + subtraction.calculate(10, 5));
        System.out.println("Multiplication: " + multiplication.calculate(10, 5));
        System.out.println("Division: " + division.calculate(10, 5));
    }
}
