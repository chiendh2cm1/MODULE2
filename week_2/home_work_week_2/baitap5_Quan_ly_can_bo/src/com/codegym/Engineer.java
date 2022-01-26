package com.codegym;

import java.util.Date;

public class Engineer extends Cadres {  //Kỹ sư
    private String trainingIndustry;

    public Engineer() {
    }

    public Engineer(String trainingIndustry) {
        this.trainingIndustry = trainingIndustry;
    }

    public Engineer(String name, Date dateOfbirth, String sex, String adress, String trainingIndustry) {
        super(name, dateOfbirth, sex, adress);
        this.trainingIndustry = trainingIndustry;
    }

    public String getTrainingIndustry() {
        return trainingIndustry;
    }

    public void setTrainingIndustry(String trainingIndustry) {
        this.trainingIndustry = trainingIndustry;
    }

    @Override
    public String toString() {
        return super.getName() + ", "
                + super.sdf.format(getDateOfBirth()) + ", "
                + super.getSex() + ", "
                + super.getAdress() + ", "
                + this.trainingIndustry;
    }
}
