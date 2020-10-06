package com.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {

    public static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-zA-Z]{2,}$";

    public boolean registrationFirstName(String fname) {
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(fname).matches();
    }
}
