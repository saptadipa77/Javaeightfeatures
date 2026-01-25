package com.gevernova.DaywiseAssignments.Day2.UserRegistrationProblem;

public class Email {
    public static boolean validateEmail(String email) {
            String emailregex="^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)?@" +
                    "[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";
            return Pattern.matches(emailregex, email);
    }

    public static void main(String[] args){
        System.out.println(validateEmail("abc.xyz@bl.co.in"));
        System.out.println(validateEmail("abc@b1"));
    }
}