package com.gevernova.DaywiseAssignments.Day3.TimeApis;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DuraionBetweenDates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start date (yyyy-mm-dd): ");
        LocalDate start = LocalDate.parse(sc.next());

        System.out.print("Enter end date (yyyy-mm-dd): ");
        LocalDate end = LocalDate.parse(sc.next());

        Period period = Period.between(start, end);

        System.out.println("Difference: " +
                period.getYears() + " years " +
                period.getMonths() + " months " +
                period.getDays() + " days");
    }
}

