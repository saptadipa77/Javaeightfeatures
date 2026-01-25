package com.gevernova.DaywiseAssignments.Day1.VirtualClassroom;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Virtual Classroom");
        Scanner sc = new Scanner(System.in);
        VirtualClassroom vc = new VirtualClassroom();
        int ch;
        do {
            System.out.println("\n1.Add student");
            System.out.println("2.Add instructor");
            System.out.println("3.Add course");
            System.out.println("4.Enroll student");
            System.out.println("5.Submit assignment");
            System.out.println("6.Grade assignment");
            System.out.println("7.Exit");
            System.out.println("Enter your choice");

            ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.println("Student ID: ");
                    String sid = sc.nextLine();
                    System.out.println("Student Name: ");
                    String name = sc.nextLine();
                    vc.addStudent(sid, name);
                    break;

                case 2:
                    System.out.println("Instructor ID: ");
                    String id = sc.nextLine();
                    System.out.println("Instructor Name: ");
                    String name1 = sc.nextLine();
                    vc.addInstructor(id, name1);
                    break;

                case 3:
                    System.out.println("Course name: ");
                    String cn = sc.nextLine();
                    System.out.println("Schedule: ");
                    String schedule = sc.nextLine();
                    System.out.println("Material: ");
                    String material = sc.nextLine();
                    System.out.println("Instructor ID: ");
                    String instructorId = sc.nextLine();
                    vc.addCourse(cn, schedule, material, vc.instructors.get(instructorId));
                    break;

                case 4:
                    System.out.println("Course name: ");
                    String courseName = sc.nextLine();
                    System.out.println("Student ID: ");
                    String id1 = sc.nextLine();
                    vc.enrollStudent(id1, courseName);
                    break;

                case 5:
                    System.out.println("Course name: ");
                    String courseName1 = sc.nextLine();
                    System.out.println("Assignment title: ");
                    String title = sc.nextLine();
                    System.out.println("Student ID: ");
                    String id2 = sc.nextLine();
                    System.out.println("Content: ");
                    String content = sc.nextLine();
                    vc.submitAssignment(courseName1, title, id2, content);
                    break;

                case 6:
                    System.out.println("Course name: ");
                    String c3 = sc.nextLine();
                    System.out.println("Assignment title: ");
                    String title1 = sc.nextLine();
                    System.out.println("Student ID: ");
                    String id3 = sc.nextLine();
                    System.out.println("Grade: ");
                    String grade = sc.nextLine();
                    System.out.println("Feedback: ");
                    String feedback = sc.nextLine();
                    vc.gradeAssignment(c3, title1, id3, grade, feedback);
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");


            }
        }while(ch!=7);
    }
}