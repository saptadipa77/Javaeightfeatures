package com.gevernova.DaywiseAssignments.Day3.MethodReferences;

import java.util.Arrays;
import java.util.List;

public class UpperCase {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "java", "stream", "reference");

        words.stream()
                .map(String::toUpperCase) // Method Reference
                .forEach(System.out::println); // Method Reference for printing
    }
}

