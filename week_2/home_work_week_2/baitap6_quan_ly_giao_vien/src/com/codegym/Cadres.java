package com.codegym;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cadres {
    private String name;
    private Date dateOfBirth;
    private String adress;

    public Cadres() {
    }

    public Cadres(String name, Date dateOfBirth, String adress) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.adress = adress;
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    public void display() {
        System.out.println("Họ và tên: " + this.name);
        System.out.println("Ngày sinh: " + sdf.format(this.dateOfBirth));
        System.out.println("Địa chỉ: " + this.adress);

    }
}
