package com.codegym;

public class Student {
    private String name;
    private String studentCode;
    private String dateOfBirth;
    private String className;

    public Student() {
    }

    public Student(String name, String studentCode, String dateOfBirth, String className) {
        this.name = name;
        this.studentCode = studentCode;
        this.dateOfBirth = dateOfBirth;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return name + ", "
                + studentCode + ", "
                + dateOfBirth + ", "
                + className;
    }
}
