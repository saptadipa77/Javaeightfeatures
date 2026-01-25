package com.gevernova.DaywiseAssignments.Day3.TimeApis;

import java.time.ZonedDateTime;
import java.time.ZoneId;

public class ZoneDateTime {
    public static void main(String[] args) {

        ZonedDateTime indiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime usaTime = indiaTime.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("India Time: " + indiaTime);
        System.out.println("USA Time: " + usaTime);
    }
}

