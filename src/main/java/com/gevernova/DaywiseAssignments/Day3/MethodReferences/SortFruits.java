package com.gevernova.DaywiseAssignments.Day3.MethodReferences;

import java.util.*;

public class SortFruits {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Banana", "apple", "Cherry");

        // Type::methodName (Arbitrary instance of String)
        list.sort(String::compareToIgnoreCase);

        System.out.println(list);
    }
}

