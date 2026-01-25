package com.gevernova.DaywiseAssignments.Day3.TimeApis;

import java.time.ZonedDateTime;

public class ZonedDateTimeSavings {
    public static void main(String[] args) {


        ZonedDateTime now = ZonedDateTime.now();
        boolean isDST = now.getZone().getRules().isDaylightSavings(now.toInstant());

        System.out.println("Is Daylight Saving Time active? " + isDST);
    }
}

