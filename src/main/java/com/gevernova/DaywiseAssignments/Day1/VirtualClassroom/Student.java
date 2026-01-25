package com.gevernova.DaywiseAssignments.Day1.VirtualClassroom;
import java.util.HashMap;
import java.util.Map;

public class Student {
    String id;
    String name;
    Map<String,String> grades=new HashMap<>();
    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

}
