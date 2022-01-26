package com.codegym;

import java.util.Date;

public class Worker extends Cadres { //Công nhân
    private String Tier;

    public Worker() {
    }

    public Worker(String tier) {
        Tier = tier;
    }

    public Worker(String name, Date dateOfBirth, String sex, String adress, String tier) {
        super(name, dateOfBirth, sex, adress);
        Tier = tier;
    }

    public String getTier() {
        return Tier;
    }

    public void setTier(String tier) {
        Tier = tier;
    }

    @Override
    public String toString() {
        return super.getName() + ", "
                + super.sdf.format(getDateOfBirth()) + ", "
                + super.getSex() + ", "
                + super.getAdress() + ", "
                + this.Tier;
    }
}
