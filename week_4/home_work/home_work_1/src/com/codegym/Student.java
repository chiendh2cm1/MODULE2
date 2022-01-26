package com.codegym;

public class Student {
    String studentCode;
    String name;
    String adress;
    String classroom;
    double poin;

    public Student() {
    }

    public Student(String studentCode, String name, String adress, String classroom, double poin) {
        this.studentCode = studentCode;
        this.name = name;
        this.adress = adress;
        this.classroom = classroom;
        this.poin = poin;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public double getPoin() {
        return poin;
    }

    public void setPoin(double poin) {
        this.poin = poin;
    }

    @Override
    public String toString() {
        return this.studentCode + ", " + this.name + ", " + this.adress + ", " + this.classroom + ", " + this.poin;
    }
}
