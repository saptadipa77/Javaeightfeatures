package com.gevernova.DaywiseAssignments.Day1.VirtualClassroom;

import java.util.Map;

public class Assignment {
    String title;
    String deadline;
    Map<String,Submission> submissions;

    public Assignment(String title, String deadline) {
        this.title = title;
        this.deadline = deadline;
    }
}
