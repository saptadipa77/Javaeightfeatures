package com.gevernova.DaywiseAssignments.Day3.TimeApis;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter birthday (yyyy-mm-dd): ");
        LocalDate birthday = LocalDate.parse(sc.next());

        LocalDate today = LocalDate.now();
        LocalDate nextBirthday = birthday.withYear(today.getYear());

        if (nextBirthday.isBefore(today) || nextBirthday.isEqual(today)) {
            nextBirthday = nextBirthday.plusYears(1);
        }

        long days = ChronoUnit.DAYS.between(today, nextBirthday);

        System.out.println("Days until next birthday: " + days);
    }
}

