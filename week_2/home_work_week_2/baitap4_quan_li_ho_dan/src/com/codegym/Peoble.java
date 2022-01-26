package com.codegym;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Peoble {
    private String name;
    private Date dateOfBirth;
    private String job;

    public Peoble(String name, Date dateOfBirth, String job) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.job = job;
    }

    public Peoble() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    @Override
    public String toString() {
        return this.name + ", " + sdf.format(this.dateOfBirth) + ", " + this.job;
    }
}
