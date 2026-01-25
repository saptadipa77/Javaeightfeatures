package com.gevernova.DaywiseAssignments.Day3.MethodReferences;

import java.util.*;
import java.util.stream.Collectors;

class Person {

    int id;
    public Person(int id) {

        this.id = id;
    }
    @Override
    public String toString() {

        return "Person{id=" + id + "}";
    }
}

public class PersonObject {

    public static void main(String[] args) {

        Random random = new Random();

        List<Person> people = random.ints(5, 1, 100) // 5 random ints between 1-100
                .boxed() //converting into object
                .map(Person::new) // Constructor Reference
                .collect(Collectors.toList());

        people.forEach(System.out::println);
    }
}

