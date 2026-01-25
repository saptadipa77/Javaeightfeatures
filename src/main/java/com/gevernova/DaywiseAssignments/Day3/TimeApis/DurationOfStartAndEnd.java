package com.gevernova.DaywiseAssignments.Day3.TimeApis;

import java.time.Duration;
import java.time.Instant;

public class DurationOfStartAndEnd {
    public static void main(String[] args) {

        Instant start= Instant.now();

        for (int i = 0; i < 1_000_0000; i++) {
            Math.sqrt(i);
        }

        Instant end = Instant.now();

        Duration duration = Duration.between(start, end);
        System.out.println("Execution Time (seconds): " + duration.getSeconds());
    }
}

