package com.gevernova.DaywiseAssignments.Day1.VirtualClassroom;
import java.util.*;
public class Course {
    String name;
    String schedule;
    String material;
    Instructor instructor;
    List<Student> students=new ArrayList<>();
    List<Assignment> assignments=new ArrayList<>();

    public Course(String name, String schedule, String material, Instructor instructor) {
        this.name = name;
        this.schedule = schedule;
        this.material = material;
        this.instructor = instructor;
    }

    public void addEnrollmmentStudent(Student student){
        students.add(student);
    }

    public void approveEnrollment(Student student){
        boolean approved=false;
        if(students.contains(student)){
            System.out.println("Student is already approved");
        }
        else if(approved==true){
            students.add(student);
        }
        else{
            System.out.println("Student is not approved");
        }

    }

    public void addAssignment(Assignment assignment){
        assignments.add(assignment);
    }

}

