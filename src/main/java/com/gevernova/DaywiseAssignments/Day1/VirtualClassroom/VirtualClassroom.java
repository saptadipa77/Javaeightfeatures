package com.gevernova.DaywiseAssignments.Day1.VirtualClassroom;
import java.util.*;

public class VirtualClassroom {
    Map<String,Course> courses = new HashMap<>();
    Map<String,Student> students = new HashMap<>();
    Map<String,Instructor> instructors = new HashMap<>();

    public void addCourse(String name,String schedule,String material,Instructor instructor){
        Course c=new Course(name,schedule,material,instructor);
        courses.put(name,c);
    }
    public void addStudent(String id,String name){
        Student s=new Student(id,name);
        students.put(id,s);
    }

    public void addInstructor(String id,String name){
        Instructor i=new Instructor(id,name);
        instructors.put(id,i);
    }

    public void enrollStudent(String courseName,String studentId)
    {
        Course c=courses.get(courseName);
        Student s=students.get(studentId);
        if(c!=null && s!=null)
        {
            c.addEnrollmmentStudent(s);
        }
    }
    public void submitAssignment(String coursename,String assignmnettitle,String studentId,String content){
        Course c=courses.get(coursename);
        for(Assignment a: c.assignments)
        {
            if(a.title.equals(assignmnettitle))
            {
                a.submissions.put(studentId,new Submission(studentId,content));
                System.out.println("Submission received from student "+studentId);
                return;
            }
        }
    }

    public void gradeAssignment(String coursename,String assignmenttitle,String studentId,String grade,String feedback){
        Course c=courses.get(coursename);
        for(Assignment a: c.assignments)
        {
            if(a.title.equals(assignmenttitle))
            {
                Submission s=a.submissions.get(studentId);
                if(s!=null){
                    s.grade=grade;
                    s.feedback=feedback;
                    System.out.println("Graded student "+studentId+": "+grade);
                }
            }
        }
    }
}

