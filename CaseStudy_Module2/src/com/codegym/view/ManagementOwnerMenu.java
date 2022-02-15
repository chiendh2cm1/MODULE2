package com.codegym.view;

import java.util.Scanner;

public class ManagementOwnerMenu {
    public Scanner sc = new Scanner(System.in);
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_RESET = "\u001B[0m";
    public void run() {
        ProductMenu productMenu = new ProductMenu();
        OrderMenu orderMenu = new OrderMenu();
        StaffMenu staffMenu = new StaffMenu();
        int choice;
        boolean flag = true;
        while (flag) {
            try {
                do {
                    System.out.println();
                    System.out.println("\t\t\t\t\t\t\t##============================== QUẢN LÝ SẢN PHẨM ==============================##");
                    System.out.println("\t\t\t\t\t\t\t|| 1. Quản lý danh sách sản phẩm      || 2. Quản lý danh sách đơn hàng          ||");
                    System.out.println("\t\t\t\t\t\t\t|| 3. Quản lý danh sách nhân viên     || 0. Quay lại                            ||");
                    System.out.println("\t\t\t\t\t\t\t##====================================(^^^^)====================================##");
                    System.out.print("\t\t\t\t\t\t\tNhập vào lựa chọn của bạn: ");
                    choice = Integer.parseInt(sc.nextLine());
                    switch (choice) {
                        case 1:
                            productMenu.run();
                            break;
                        case 2:
                            orderMenu.run();
                            break;
                        case 3:
                            staffMenu.run();
                        case 0:
                            flag = false;
                            break;
                        default:
                            System.out.println(TEXT_RED+"\t\t\t\t\t\t\t>>>>>>>>>>>>>>>>>>>>>>>>>> NHẬP TRONG KHOẢNG TỪ 0 ĐẾN 3 <<<<<<<<<<<<<<<<<<<<<<<<<<<"+TEXT_RESET);
                            break;
                    }
                } while (choice != 0);
            } catch (Exception e) {
                System.out.println(TEXT_RED+"\t\t\t\t\t\t\t>>>>>>>>>>>>>>>>>>>>>>>>>>>>> XIN VUI LÒNG NHẬP SỐ <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<"+TEXT_RESET);
            }
        }
    }
}
