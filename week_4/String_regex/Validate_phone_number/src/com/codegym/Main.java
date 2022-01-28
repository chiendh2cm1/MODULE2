package com.codegym;

public class Main {

    public static final String[] validPhoneNumber = new String[]{"(84)-(0978489648)"};
    public static final String[] invalidPhoneNumber = new String[]{"(a8)-(22222222)"};

    public static void main(String[] args) {
        PhoneNumberExample phoneNumberExample = new PhoneNumberExample();

        for (String phoneNumber : validPhoneNumber) {
            boolean isvalid = phoneNumberExample.validate(phoneNumber);
            System.out.println("Account is " + phoneNumber + " is valid: " + isvalid);
        }
        for (String phoneNumber : invalidPhoneNumber) {
            boolean isvalid = phoneNumberExample.validate(phoneNumber);
            System.out.println("Account is " + phoneNumber + " is valid: " + isvalid);
        }
    }
}
