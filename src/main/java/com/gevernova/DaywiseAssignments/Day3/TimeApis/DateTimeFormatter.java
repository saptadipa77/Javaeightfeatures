package com.gevernova.DaywiseAssignments.Day3.TimeApis;

import java.time.LocalDateTime;
import java.util.Scanner;

public class DateTimeFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date (dd-MMM-yyyy HH:mm:ss): ");
        String input = sc.nextLine();

        java.time.format.DateTimeFormatter formatter =
                java.time.format.DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");

        LocalDateTime dateTime = LocalDateTime.parse(input, formatter);
        System.out.println("Parsed DateTime: " + dateTime);
    }
}


