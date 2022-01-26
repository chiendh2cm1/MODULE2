package com.codegym;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        TownManagement townManagement = new TownManagement();
        menu();
        int choice;
        do {
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("1.Hiển thị thông tin các hộ dân.");
                    townManagement.displayHouseHolds();
                    break;
                }
                case 2: {
                    System.out.println("2. Nhập thông tin các hộ dân trong khu phố.");
                    inputHouseHolds(townManagement);
                    break;
                }
                case 3: {
                    System.out.println("3. Thêm 1 hộ dân vào vị trí bất kì.");
                    System.out.println("Nhập vị trí cần thêm:");
                    int index = sc.nextInt();
                    if (index < 0 || index > townManagement.size()) {
                        System.out.println("Không có vị trí cần thêm");
                    } else {
                        HouseHold houseHold = new HouseHold();
                        System.out.println("Nhập thông tin hộ dân: ");
                        houseHold.inputHouseHold(sc);
                        townManagement.addHouseHold(index, houseHold);
                    }
                    break;
                }
                case 4: {
                    System.out.println("4. Xóa 1 hộ dân trong danh sách");
                    System.out.println("Nhập vị trí cần xóa:");
                    int index = sc.nextInt();
                    if (index < 0 || index > townManagement.size()) {
                        System.out.println("Không có vị trí cần xóa");
                    } else {
                        townManagement.removeHouseHold(index);
                    }
                    break;
                }
                case 5: {
                    System.out.println("5. Cập nhập lại thông tin 1 hộ dân.");
                    System.out.println("Nhập vị trí cần cập nhập:");
                    int index = sc.nextInt();
                    if (index < 0 || index > townManagement.size()) {
                        System.out.println("Không có vị trí cần cập nhập");
                    } else {
                        HouseHold houseHold = new HouseHold();
                        System.out.println("Nhập thông tin hộ dân: ");
                        houseHold.inputHouseHold(sc);
                        townManagement.updateHouseHold(index, houseHold);
                    }
                    break;
                }
                case 6: {
                    System.out.println("6. Tìm kiếm 1 hộ dân trong khu phố theo số nhà");
                    sc.nextLine();
                    System.out.println("Nhập số nhà hộ dân bạn cần tìm thông tin:");
                    String apartmentNumber = sc.nextLine();
                    townManagement.searchHouseHold(apartmentNumber);
                    break;
                }
                case 7: {
                    System.out.println("Hiển thị danh sách thông tin các hộ có người mừng thọ.");
                    townManagement.showHappyList();
                    break;
                }
                case 8: {
                    System.out.println("8. Sắp xếp danh sách sinh viên theo số nhà.");
                    townManagement.sortHouseHold();
                    break;
                }
                case 0: {
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Vui lòng nhập trong khoảng từ 0 đến 8!!!");
                }
            }
        } while (choice >= 0 && choice < 9);
    }

    private static void menu() {
        System.out.println("---Chương trình quản lý hộ dân trong khu phố: ");
        System.out.println("1. Hiển thị thông tin các hộ dân trong khu phố.");
        System.out.println("2. Nhập thông tin các hộ dân trong khu phố.");
        System.out.println("3. Thêm 1 hộ dân vào vị trí bất kì.");
        System.out.println("4. Xóa 1 hộ dân trong danh sách.");
        System.out.println("5. Cập nhập  lại 1 hộ dân.");
        System.out.println("6.Tìm kiếm 1 hộ dân trong khu phố");
        System.out.println("7. Hiển thị danh sách thông tin các hộ có người mừng thọ.");
        System.out.println("8. Sắp xếp danh sách hộ dân theo số nhà.");
    }

    private static void inputHouseHolds(TownManagement townManagement) {
        System.out.println(" Nhập số lượng hộ dân: ");
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println("Hộ dân thứ: " + (i + 1) + " : ");
            HouseHold houseHold = new HouseHold();
            houseHold.inputHouseHold(sc);
            townManagement.addHouseHold(houseHold);
        }
    }
}
