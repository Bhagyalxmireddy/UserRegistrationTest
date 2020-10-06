package com.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue()
    {
        UserRegistration registration = new UserRegistration();
        boolean result = registration.registrationFirstName("Bhagi");
        Assert.assertTrue(result);
    }
    @Test
    public void givenFirstName_WhenHaveSplChar_ShouldReturnFalse()
    {
        UserRegistration registration = new UserRegistration();
        boolean result = registration.registrationFirstName("Bh@gi");
        Assert.assertFalse(result);
    }
    @Test
    public void givenFirstName_WhenHaveSplCharAndNum_ShouldReturnFalse()
    {
        UserRegistration registration = new UserRegistration();
        boolean result = registration.registrationFirstName("Bh@gi123");
        Assert.assertFalse(result);
    }
    @Test
    public void givenFirstName_WhenHaveNum_ShouldReturnFalse()
    {
        UserRegistration registration = new UserRegistration();
        boolean result = registration.registrationFirstName("Bhagi11");
        Assert.assertFalse(result);
    }
    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFalse()
    {
        UserRegistration registration = new UserRegistration();
        boolean result = registration.registrationFirstName("bhagi");
        Assert.assertFalse(result);
    }

}
