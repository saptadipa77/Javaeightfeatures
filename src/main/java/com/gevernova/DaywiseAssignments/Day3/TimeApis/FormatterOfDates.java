package com.gevernova.DaywiseAssignments.Day3.TimeApis;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FormatterOfDates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date (yyyy-MM-dd): ");
        String input = sc.next();

        DateTimeFormatter inputformat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter outputformat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate date= LocalDate.parse(input,inputformat);
        System.out.println("Formatted Date: "+date.format(outputformat));

    }
}

