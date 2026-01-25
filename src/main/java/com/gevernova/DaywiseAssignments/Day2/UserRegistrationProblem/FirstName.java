package com.gevernova.DaywiseAssignments.Day2.UserRegistrationProblem;

import java.util.regex.Pattern;

public class FirstName
{
    public static boolean validateFirstName(String firstName)
    {
        return Pattern.matches("^[A-Z][a-z]{2,}$", firstName);
    }
	public static void main(String[] args)
	{
        System.out.println(validateFirstName("John"));
        System.out.println(validateFirstName("jane"));
    }
}