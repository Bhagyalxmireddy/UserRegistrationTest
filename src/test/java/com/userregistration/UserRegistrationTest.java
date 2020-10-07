package com.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration registration = new UserRegistration();
        boolean result = registration.registrationFirstName("Bhagi");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenHaveSplChar_ShouldReturnFalse() {
        UserRegistration registration = new UserRegistration();
        boolean result = registration.registrationFirstName("Bh@gi");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenHaveSplCharAndNum_ShouldReturnFalse() {
        UserRegistration registration = new UserRegistration();
        boolean result = registration.registrationFirstName("Bh@gi123");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenHaveNum_ShouldReturnFalse() {
        UserRegistration registration = new UserRegistration();
        boolean result = registration.registrationFirstName("Bhagi11");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
        UserRegistration registration = new UserRegistration();
        boolean result = registration.registrationFirstName("bhagi");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTure() {
        UserRegistration registration = new UserRegistration();
        boolean result = registration.registrationLastName("Bhagi");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenHaveSplChar_ShouldReturnFalse() {
        UserRegistration registration = new UserRegistration();
        boolean result = registration.registrationLastName("Bh@gi");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenHaveNum_ShouldReturnFalse() {
        UserRegistration registration = new UserRegistration();
        boolean result = registration.registrationLastName("Bhagi111");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenHaveSplCharAndNum_ShouldReturnFalse() {
        UserRegistration registration = new UserRegistration();
        boolean result = registration.registrationLastName("Bh@gi123");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
        UserRegistration registration = new UserRegistration();
        boolean result = registration.registrationLastName("bhagi");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmailAddress_WhenProper_ShouldReturnTure() {
        UserRegistration registration = new UserRegistration();
        boolean result = registration.registrationEmailAddress("abc@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmailAddress_WhenWithContiuneSplChar_ShouldReturnFalse() {
        UserRegistration registration = new UserRegistration();
        boolean result = registration.registrationEmailAddress("abc@.gmail.com");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmailAddress_WhenNotProper_ShouldReturnFalse() {
        UserRegistration registration = new UserRegistration();
        boolean result = registration.registrationEmailAddress("abc@gmail.in.");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTure() {
        UserRegistration registration = new UserRegistration();
        boolean result = registration.registrationMobileNumber("91 9632580147");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNumber_WhenNotProper_ShouldReturnFalse() {
        UserRegistration registration = new UserRegistration();
        boolean result = registration.registrationMobileNumber("963580147");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassWord_WhenProper_ShouldReturnTure() {
        UserRegistration registration = new UserRegistration();
        boolean result = registration.registrationPassWord("bhagyalaxmi");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassWord_WhenNotProper_ShouldReturnFalse() {
        UserRegistration registration = new UserRegistration();
        boolean result = registration.registrationPassWord("bhagya");
        Assert.assertFalse(result);
    }
    @Test
    public void givenPassWord_WhenWithOneAtleatUpper_ShouldReturnTrue() {
        UserRegistration registration = new UserRegistration();
        boolean result = registration.registrationPassWord("Bhagyalaxmi");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPassWord_WhenNotHaveAnAtleastOneUpper_ShouldReturnFalse() {
        UserRegistration registration = new UserRegistration();
        boolean result = registration.registrationPassWord("bhagyalaxmi");
        Assert.assertFalse(result);

    }
    @Test
    public void givenPassWord_WhenWithOneAtleatNumber_ShouldReturnTrue() {
        UserRegistration registration = new UserRegistration();
        boolean result = registration.registrationPassWord("Bhagyalaxmi1");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPassWord_WhenNotWithOneAtleatNumber_ShouldReturnFalse() {
        UserRegistration registration = new UserRegistration();
        boolean result = registration.registrationPassWord("Bhagyalaxmi");
        Assert.assertFalse(result);
    }
}