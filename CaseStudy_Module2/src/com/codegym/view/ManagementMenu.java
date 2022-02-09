package com.codegym.view;

import java.util.Scanner;

public class ManagementMenu {
    public Scanner sc = new Scanner(System.in);

    public void run() {
        ProductMenu productMenu = new ProductMenu();
        OrderMenu orderMenu = new OrderMenu();
        int choice;
        boolean flag = true;
        while (flag) {
            try {
                do {
                    System.out.println();
                    System.out.println("\t\t\t\t\t\t\t##============================== QUẢN LÝ CỬA HÀNG ==============================##");
                    System.out.println("\t\t\t\t\t\t\t|| 1. Quản lý danh sách sản phẩm      || 5. Quản lý danh sách đơn hàng           ||");
                    System.out.println("\t\t\t\t\t\t\t|| 0. Thoát                           ||                                         ||");
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
                        case 0:
                            flag = false;
                            break;
                        default:
                            System.err.println("\t\t\t\t\t\t\t>>>>>>>>>>>>>>>>>>>>>>>>>> NHẬP TRONG KHOẢNG TỪ 0 ĐẾN 6 <<<<<<<<<<<<<<<<<<<<<<<<<<<");
                            break;
                    }
                } while (choice != 0);
            } catch (Exception e) {
                System.err.println("\t\t\t\t\t\t\t>>>>>>>>>>>>>>>>>>>>>>>>>>>>> XIN VUI LÒNG NHẬP SỐ <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
            }
        }
    }
}
