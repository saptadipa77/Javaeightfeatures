package com.gevernova.DaywiseAssignments.Day2.UserRegistrationProblem;

import static org.junit.Assert.assertTrue;
//import static org.junit.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class HappySadJUnit {
    @Test
    void happyTestFirstName(){

        assertTrue(FirstName.validateFirstName("Amit"));
    }

    @Test
    void happyTestLastName(){
        assertTrue(LastName.validateLastName("Datta"));
    }

    @Test
    void happyTestEmail(){

        assertTrue(Email.validateEmail("Amit@gmail.com"));
    }

    @Test
    void happyTestMobile(){

        assertTrue(MobileNo.validateMobile("7890512345"));
    }

    @Test
    void happyTestPassword(){

        assertTrue(Password.validatePassword("Amit@1234"));
    }




    @Test
    void sadTestFirstName(){

        assertTrue(FirstName.validateFirstName("1Amit"));
    }

    @Test
    void sadTestLastName(){

        assertTrue(LastName.validateLastName("34Datta"));
    }

    @Test
    void sadTestEmail(){

        assertTrue(Email.validateEmail("@Amit@gmail.com"));
    }

    @Test
    void sadTestMobile(){

        assertTrue(MobileNo.validateMobile("A7890512345"));
    }

    @Test
    void sadTestPassword(){

        assertTrue(Password.validatePassword("0^Amit@1234"));
    }
}