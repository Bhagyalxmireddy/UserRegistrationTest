package com.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {

    public static final String NAME_PATTERN = "^[A-Z]{1}[a-zA-Z]{2,}$";
    public static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+(.[a-zA-Z0-9]+)*@[a-zA-Z]+.[a-zA-Z]{2,4}(.[a-zA-Z]{2,2})?$";
    public static final String MOBILE_PATTERN = "(^[0-9]{1,3}[ ]+)?[6-9]+[0-9]{9}$";
    public static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{8,20}";

    public boolean registrationFirstName(String fname) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(fname).matches();
    }

    public boolean registrationLastName(String lname) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(lname).matches();
    }

    public boolean registrationEmailAddress(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(email).matches();
    }

    public boolean registrationMobileNumber(String phnonum) {
        Pattern pattern = Pattern.compile(MOBILE_PATTERN);
        return pattern.matcher(phnonum).matches();

    }

    public boolean registrationPassWord(String pwd) {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        return pattern.matcher(pwd).matches();
    }
}
