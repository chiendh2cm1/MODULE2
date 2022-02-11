package com.codegym.model;

import java.io.Serializable;

public class Staff implements Serializable{
    private String staffId;
    private String fullName;
    private int age;
    private String phoneNumber;
    private double wage;   //tiền công.

    public Staff(String staffId, String fullName, int age, String phoneNumber, double wage) {
        this.staffId = staffId;
        this.fullName = fullName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.wage = wage;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffId='" + staffId + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", wage='" + wage + '\'' +
                '}';
    }
}
