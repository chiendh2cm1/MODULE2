package com.codegym;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class HouseHold {
    private int numPeoples;
    private String apartmentNumber;
    private ArrayList<Peoble> peobles;

    public HouseHold() {
        peobles = new ArrayList<>(10);
    }

    public HouseHold(int numPeoples, String apartmentNumber, ArrayList<Peoble> peobles) {
        this.numPeoples = numPeoples;
        this.apartmentNumber = apartmentNumber;
        this.peobles = peobles;
    }

    public int getNumPeoples() {
        return numPeoples;
    }

    public void setNumPeoples(int numPeoples) {
        this.numPeoples = numPeoples;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public ArrayList<Peoble> getPeobles() {
        return peobles;
    }

    public void setPeobles(ArrayList<Peoble> peobles) {
        this.peobles = peobles;
    }

    public void inputHouseHold(Scanner sc) {
        System.out.println("Nhập số người trong hộ: ");
        this.numPeoples = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhâp số nhà: ");
        this.apartmentNumber = sc.nextLine();
        System.out.println("Nhập các thành viên trong hộ: ");
        for (int i = 0; i < numPeoples; i++) {
            System.out.println("Thành viên thứ " + (i + 1) + " :");
            System.out.println("Nhập tên: ");
            String name = sc.nextLine();
            System.out.println("Nhập ngày sinh: ");
            String strDateOfBirth = sc.nextLine();
            Date dateOfbirth = strToDate(strDateOfBirth);
            System.out.println("Nhập nghề nghiệp: ");
            String job = sc.nextLine();
            Peoble peoble = new Peoble(name, dateOfbirth, job);
            peobles.add(peoble);
        }
    }

    private static Date strToDate(String strDate) {
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = sdf.parse(strDate);
        } catch (Exception e) {
            System.out.println("Lỗi định dạng ngày tháng!");
        }
        return date;
    }

    public void displayHouseHold() {
        System.out.println("{");
        System.out.println("Số người: " + this.numPeoples);
        System.out.println("Số nhà: " + this.apartmentNumber);
        System.out.println("Thông tin các thành viên trong hộ: ");
        for (int i = 0; i < numPeoples; i++) {
            System.out.println(peobles.get(i));
        }
        System.out.println("}");
    }
}
