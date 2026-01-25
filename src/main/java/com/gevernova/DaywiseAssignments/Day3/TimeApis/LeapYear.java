package com.gevernova.DaywiseAssignments.Day3.TimeApis;

import java.time.Year;

public class LeapYear {
    public static void main(String[] args) {
        Year currentYear = Year.now();

        if (currentYear.isLeap()) {
            System.out.println(currentYear + " is a Leap Year");
        } else {
            System.out.println(currentYear + " is NOT a Leap Year");
        }
    }
}


