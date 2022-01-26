package com.codegym;

import java.util.Date;

public class Staff extends Cadres {  //Nhân viên
    private String work;


    public Staff() {
    }

    public Staff(String work) {
        this.work = work;
    }

    public Staff(String name, Date dateOfbirth, String sex, String adress, String work) {
        super(name, dateOfbirth, sex, adress);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return super.getName() + ", "
                + super.sdf.format(getDateOfBirth()) + ", "
                + super.getSex() + ", "
                + super.getAdress() + ", "
                + this.work;
    }
}
