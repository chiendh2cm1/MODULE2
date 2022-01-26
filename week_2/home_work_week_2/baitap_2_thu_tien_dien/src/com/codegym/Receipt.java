package com.codegym;

public class Receipt {
    double oldPowerIndicator;// chỉ số điện trước
    double newPowerIdecator;// chỉ số điện sau
    Costomer costomer;

    public Receipt() {
    }

    public Receipt(double oldPowerIndicator, double newPowerIdecator, Costomer costomer) {

        this.oldPowerIndicator = oldPowerIndicator;
        this.newPowerIdecator = newPowerIdecator;
        this.costomer = costomer;
    }

    public double getOldPowerIndicator() {
        return oldPowerIndicator;
    }

    public void setOldPowerIndicator(double oldPowerIndicator) {
        this.oldPowerIndicator = oldPowerIndicator;
    }

    public double getNewPowerIdecator() {
        return newPowerIdecator;
    }

    public void setNewPowerIdecator(double newPowerIdecator) {
        this.newPowerIdecator = newPowerIdecator;
    }

    public Costomer getCostomer() {
        return costomer;
    }

    public void setCostomer(Costomer costomer) {
        this.costomer = costomer;
    }

    @Override
    public String toString() {
        return costomer + ", " + this.oldPowerIndicator + ", " + this.newPowerIdecator;
    }
}
