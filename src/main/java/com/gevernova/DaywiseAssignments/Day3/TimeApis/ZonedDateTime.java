package com.gevernova.DaywiseAssignments.Day3.TimeApis;

import java.time.Duration;
import java.time.ZoneId;

public class ZonedDateTime {
    public static void main(String[] args) {
        java.time.ZonedDateTime utc = java.time.ZonedDateTime.now(ZoneId.of("UTC"));
        java.time.ZonedDateTime local= java.time.ZonedDateTime.now();

        Duration duration=Duration.between(utc,local);
        System.out.println("Difference:");
        System.out.println("Hours: " + duration.toHours());
        System.out.println("Minutes: " + duration.toMinutes());
    }
}

