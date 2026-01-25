package com.gevernova.DaywiseAssignments.Day3.MethodReferences;

import java.util.Optional;
import java.util.Scanner;

public class OptionalClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();


        Optional<String> optional=Optional.ofNullable(input)
                .map(String::toUpperCase); // Method Reference


        // Method Reference
        System.out.println(optional.orElse("not found"));
    }
}

