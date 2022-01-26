package com.codegym;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ManageReceipts manageReceipts = new ManageReceipts();
        Menu();
        int choice;
        do {
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 0: {
                }
                case 1: {
                    System.out.println("---Danh sách biên lai sử dụng điện---");
                    manageReceipts.displayReceipt();
                    break;
                }
                case 2: {
                    System.out.println("---Thêm biên lai---");
                    System.out.println("Nhập vị trí cần thêm:");
                    int index = sc.nextInt();
                    if (index < 0 || index > manageReceipts.size())
                        System.out.println("Vị trí cần thêm không tồn tại.");
                    else {
                        Receipt receipt = getReceipt();
                        manageReceipts.addReceipt(index, receipt);
                    }
                    break;
                }
                case 3: {
                    System.out.println("---Cập nhập biên lai---");
                    System.out.println("Nhập vị trí cần chỉnh sửa:");
                    int index = sc.nextInt();
                    if (index < 0 || index >= manageReceipts.size())
                        System.out.println("Vị trí cần chỉnh sửa không tồn tại.");
                    else {
                        Receipt receipt = getReceipt();
                        manageReceipts.updateReceipt(index, receipt);
                    }
                    break;
                }
                case 4: {
                    System.out.println("---Xóa biên lai---");
                    System.out.println("Nhập vị trí cần xóa:");
                    int index = sc.nextInt();
                    if (index < 0 || index > manageReceipts.size())
                        System.out.println("Vị trí cần xóa không tồn tại.");
                    else {
                        manageReceipts.removeReceipt(index);
                    }
                    break;
                }
                case 5: {
                    System.out.println("---Tính số tiền điện hộ dân cần trả---");
                    System.out.println("Nhập tên hộ cần thanh toán:");
                    String name = sc.nextLine();
                    System.out.println("Só tiền cần thanh toán là");
                    System.out.println(manageReceipts.amountToPay(name) + " VND");
                    break;
                }
                default: {
                    System.out.println("Mời nhập lại từ 0 đến 5");
                    break;
                }
            }
        } while (choice != 0);
    }

    private static void Menu() {
        System.out.println("---Quản Lý biên lai sử dụng điện---");
        System.out.println("1. Hiển thị thông tin các biên lai.");
        System.out.println("2. Thêm biên lai.");
        System.out.println("3. Cập nhập biên lai.");
        System.out.println("4. Xóa biên lai");
        System.out.println("5.Tính số tiền hộ sử dụng điện phải trả");
        System.out.println("0. Thoát chương trình");
    }

    private static Receipt getReceipt() {
        Costomer costomer = getCostomer();
        System.out.println("Chỉ số điện cũ:");
        double oldPowerIndicator = sc.nextDouble();
        System.out.println("Chỉ số điện mới:");
        double newPowerIndicator = sc.nextDouble();
        return new Receipt(oldPowerIndicator, newPowerIndicator, costomer);
    }

    private static Costomer getCostomer() {
        sc.nextLine();
        System.out.println("Nhập thông tin khách hàng:");
        String name = sc.nextLine();
        System.out.println("Nhập số nhà: ");
        String apartmentNumber = sc.nextLine();
        System.out.println("Nhập mã số công tơ:");
        String meterCode = sc.nextLine();
        return new Costomer(name, apartmentNumber, meterCode);
    }
}
