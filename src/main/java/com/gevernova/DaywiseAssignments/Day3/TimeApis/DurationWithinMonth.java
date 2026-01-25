package com.gevernova.DaywiseAssignments.Day3.TimeApis;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class DurationWithinMonth {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        LocalDate firstDay = today.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate lastDay = today.with(TemporalAdjusters.lastDayOfMonth());

        System.out.println("First Day: " + firstDay);
        System.out.println("Last Day: " + lastDay);
    }
}

