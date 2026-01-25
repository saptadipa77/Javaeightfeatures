package com.gevernova.DaywiseAssignments.Day3.MethodReferences.PersonName;

import java.util.*;
public class Main {
    public static void main(String[] args) {


        List<Person> people = Arrays.asList(new Person("Alice"), new Person("Bob"));

        // Using instance method reference on an arbitrary instance
        people.stream()
                .map(Person::getName)
                .forEach(System.out::println);
    }
}

