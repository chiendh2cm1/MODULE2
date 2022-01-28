package com.codegym;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClazzNameExample {
    private static final String CLAZZNAME_REGEX = "^[ABC][\\d][\\d][\\d][\\d][GHKLM]$";

    public ClazzNameExample() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CLAZZNAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
