package com.gevernova.DaywiseAssignments.Day3.MethodReferences;
import java.util.*;
public class SquareOfNumbers {
    public static void main(String[] args) {


        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

        // Using static method reference: ClassName::methodName
               nums.
                stream().
                map(SquareOfNumbers::square).
                forEach(System.out::println);
    }

    public static int square(int n){
        return n * n;
    }
}

