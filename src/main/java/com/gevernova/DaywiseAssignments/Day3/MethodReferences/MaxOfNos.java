package com.gevernova.DaywiseAssignments.Day3.MethodReferences;

import java.util.*;

public class MaxOfNos {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 9, 9,1, 7, 5);

        // Using Method Reference: Integer::compare
        Integer max = findMax(numbers);
        System.out.println("Maximum element: " + max);
    }

    public static <T extends Comparable<T>> T findMax(List<T> list) {
        // Method reference refactoring the comparison logic
        return list.stream()
                .max(T::compareTo)
                .orElse(null);
    }
}
