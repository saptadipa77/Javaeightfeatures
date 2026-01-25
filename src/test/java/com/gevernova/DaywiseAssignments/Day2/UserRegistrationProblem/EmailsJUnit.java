package com.gevernova.DaywiseAssignments.Day2.UserRegistrationProblem;

import com.gevernova.DaywiseAssignments.Day2.UserRegistrationProblem.Email;
import org.junit.jupiter.api.Assertions;
import otg.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertTrue;
//import static org.junit.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class EmailsJUnit {
        @ParameterizedTest
        @ValueSource(strings={
                "abc@yahoo.com",
                "abc-100@yahoo.com",
                "abc11@abc.com",
                "abc@.com",
                "abc@abc"
        })

        void validEmails(String email) {

            Assertions.assertTrue(Email.validateEmail(email));
        }
    }
}