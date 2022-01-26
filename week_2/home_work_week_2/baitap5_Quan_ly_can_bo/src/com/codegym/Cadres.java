package com.codegym;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cadres {   //Cán bộ
    private String name;
    private Date dateOfBirth;
    private String sex;
    private String adress;

    public Cadres() {
    }

    public Cadres(String name, Date dateOfbirth, String sex, String adress) {
        this.name = name;
        this.dateOfBirth = dateOfbirth;
        this.sex = sex;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    @Override
    public String toString() {
        return name + ", " + sdf.format(dateOfBirth) + ", " + sex + ", " + adress;
    }
}
