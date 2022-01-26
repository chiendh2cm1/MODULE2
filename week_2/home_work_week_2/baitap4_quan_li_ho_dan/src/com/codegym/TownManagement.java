package com.codegym;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TownManagement {
    private List<HouseHold> houseHolds = new ArrayList<>();

    public List<HouseHold> getHouseHolds() {
        return houseHolds;
    }

    public void setHouseHolds(List<HouseHold> houseHolds) {
        this.houseHolds = houseHolds;
    }

    public int size() {
        return houseHolds.size();
    }

    public void displayHouseHolds() {
        for (HouseHold houseHold : houseHolds) {
            houseHold.displayHouseHold();
        }
    }

    public void addHouseHold(HouseHold houseHold) {
        houseHolds.add(houseHold);
    }

    public void addHouseHold(int index, HouseHold houseHold) {
        houseHolds.add(index, houseHold);
    }

    public void removeHouseHold(int index) {
        houseHolds.remove(index);
    }

    public void updateHouseHold(int index, HouseHold houseHold) {
        houseHolds.set(index, houseHold);
    }

    public void searchHouseHold(String apartmentNumber) {
        int count = 0;
        for (HouseHold houseHold : houseHolds) {
            if (houseHold.getApartmentNumber().equals(apartmentNumber)) {
                count++;
                houseHold.displayHouseHold();
            }
        }
        if (count == 0) {
            System.out.println("Không có hộ dân bạn cần tìm trong danh sách.");
        }
    }

    public void showHappyList() {
        Date dateNow = new Date();
        int currentYear = dateNow.getYear() + 1900;
        for (HouseHold houseHold : houseHolds) {
            for (Peoble peoble : houseHold.getPeobles()) {
                if (currentYear - (peoble.getDateOfBirth().getYear() + 1900) == 80)
                    houseHold.displayHouseHold();
                System.out.println(peoble.getDateOfBirth().getYear());
            }
        }
    }

    public void sortHouseHold() {
        for (int i = 0; i < houseHolds.size(); i++) {
            for (int j = 0; j < houseHolds.size(); j++) {
                if (houseHolds.get(i).getApartmentNumber().compareTo(houseHolds.get(j).getApartmentNumber()) < 0) {
                    HouseHold temp;
                    temp = houseHolds.set(i, houseHolds.get(j));
                    houseHolds.set(j, temp);
                }
            }
        }
    }
}

