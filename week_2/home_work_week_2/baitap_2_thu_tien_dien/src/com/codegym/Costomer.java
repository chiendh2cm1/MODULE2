package com.codegym;

public class Costomer {
    private String name;
    private String apartmentNumber;// số nhà
    private String meterCode;// số công tơ

    public Costomer() {
    }

    public Costomer(String name, String apartmentNumber, String identity) {
        this.name = name;
        this.apartmentNumber = apartmentNumber;
        this.meterCode = identity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getMeterCode() {
        return meterCode;
    }

    public void setMeterCode(String meterCode) {
        this.meterCode = meterCode;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.apartmentNumber + ", " + this.meterCode;
    }
}
