package com.gevernova.DaywiseAssignments.Day2.UserRegistrationProblem;

public class MutlipleEmails {
    public static void main(String[] args) {
        String[] emails={
                "abc@yahoo.com",
                "abc-100@yahoo.com",
                "abc11@abc.com",
                "abc@.com",
                "abc@abc"
        };

        for (String email:emails){
            System.out.println(email + "->" + Email.validateEmail(email));
        }
    }
}