package com.codegym;

import java.util.ArrayList;
import java.util.List;

public class HRM {  //Quản lý
    List<Cadres> cadresList = new ArrayList<>();

    public HRM(List<Cadres> cadresList) {
        this.cadresList = cadresList;
    }

    public HRM() {
    }

    public int SIZE(){
        return cadresList.size();
    }

    public void addCadres(Cadres cadres) {
        cadresList.add(cadres);
    }

    public void remove(int index) {
        cadresList.remove(index);
    }

    public void update(int index, Cadres cadres) {
        cadresList.set(index, cadres);
    }

    public void searchCadres(String name) {
        int count = 0;
        for (Cadres cadres : cadresList) {
            if (cadres.getName().equalsIgnoreCase(name)) {
                System.out.println(cadres);
                count++;
            }
        }
        if (count == 0)
            System.out.println("Không tìm thấy nhân viên.");
    }

    public void showCadresList() {
        for (Cadres cadres : cadresList) {
            System.out.println(cadres);
        }
    }
}
