package com.codegym;

import java.util.Date;

public class TeacherStaff extends Cadres {
    private double hardPay;
    private double bonusPay;
    private double punishPay;
    private double realField;

    public TeacherStaff() {
    }

    public TeacherStaff(double hardPay, double bonusPay, double punishPay) {
        this.hardPay = hardPay;
        this.bonusPay = bonusPay;
        this.punishPay = punishPay;
        this.realField = this.hardPay + this.bonusPay - this.punishPay;
    }

    public TeacherStaff(String name, Date dateOfBirth, String adress, double hardPay, double bonusPay, double punishPay) {
        super(name, dateOfBirth, adress);
        this.hardPay = hardPay;
        this.bonusPay = bonusPay;
        this.punishPay = punishPay;
        this.realField = this.hardPay + this.bonusPay - this.punishPay;
    }

    public double getHardPay() {
        return hardPay;
    }

    public void setHardPay(double hardPay) {
        this.hardPay = hardPay;
    }

    public double getBonusPay() {
        return bonusPay;
    }

    public void setBonusPay(double bonusPay) {
        this.bonusPay = bonusPay;
    }

    public double getPunishPay() {
        return punishPay;
    }

    public void setPunishPay(double punishPay) {
        this.punishPay = punishPay;
    }

    public double getRealField() {
        return realField;
    }

    public void setRealField(double realField) {
        this.realField = realField;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Lương cứng: " + this.hardPay + " VND");
        System.out.println("Lương thưởng: " + this.bonusPay + " VND");
        System.out.println("Lương phạt: " + this.punishPay + " VND");
        System.out.println("Lương thực lĩnh" + this.realField + " VND");
        System.out.println();
    }
}
