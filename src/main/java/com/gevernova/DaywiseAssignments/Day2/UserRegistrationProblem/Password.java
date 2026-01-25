package com.gevernova.DaywiseAssignments.Day2.UserRegistrationProblem;

import java.util.regex.Pattern;

public class Password {
    public static boolean validatePassword(String password) {
        String passwordregex="^(?=.*[A-Z](?=.*\\d)(?=[^@#$%^&+]*[@#$%^&+]*$).{8,}$).{8,}$";
        return Pattern.matches(passwordregex, password);
    }

    public static void main(String[] args){
        System.out.println(validatePassword("Abcdef@1"));
    }
}