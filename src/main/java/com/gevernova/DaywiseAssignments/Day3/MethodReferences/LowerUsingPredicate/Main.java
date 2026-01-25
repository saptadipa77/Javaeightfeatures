package com.gevernova.DaywiseAssignments.Day3.MethodReferences.LowerUsingPredicate;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date", "kiwi");

        Predicate<String,String> predicate=new Predicate<String,String>(){
            @Override
            public boolean test(String s) {
                return s != null && s.toLowerCase().contains("a");
            }
        };

                        fruits.
                        stream().
                        filter(predicate::test).
                        forEach(System.out::println);

    }
}

