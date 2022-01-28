package com.codegym;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExample {
    private static final String PHONENUMBER_REGEX = "^[(][\\d][\\d][)][-][(][0][\\d][\\d][\\d][\\d][\\d][\\d][\\d][\\d][\\d][)]$";

    public PhoneNumberExample() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(PHONENUMBER_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
