package com.codegym.view;

import com.codegym.controller.CategoryManagement;

import java.util.Scanner;

public class Main2 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        CategoryManagement categoryManagement = new CategoryManagement();
        int choice;
        boolean flag = true;
        while (flag) {
            try {
                do {
                    System.out.println();
                    System.out.println("\t\t\t\t\t\t\t##============================== QUẢN LÝ DANH MỤC ==============================##");
                    System.out.println("\t\t\t\t\t\t\t|| 1. Hiển thị danh sách sách danh mục   || 4. Xóa danh mục                     ||");
                    System.out.println("\t\t\t\t\t\t\t|| 2. Thêm danh mục mới                  || 5. Quay lại                         ||");
                    System.out.println("\t\t\t\t\t\t\t|| 3. Sửa đổi thông tin danh mục         ||                                     ||");
                    System.out.println("\t\t\t\t\t\t\t##====================================(^^^^)====================================##");
                    System.out.print("\t\t\t\t\t\t\tNhập vào lựa chọn của bạn: ");
                    choice = Integer.parseInt(sc.nextLine());
                    switch (choice) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 0:
                            flag = false;
                            break;
                        default:
                            System.err.println("\t\t\t\t\t\t\t>>>>>>>>>>>>>>>>>>>>>>>>>> Nhập trong khoảng từ 0 đến 6 <<<<<<<<<<<<<<<<<<<<<<<<<<<");
                            break;

                    }
                } while (choice != 0);
            } catch (Exception e) {
                System.err.println("\t\t\t\t\t\t\t>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Xin vui lòng nhập số <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
            }
        }
    }
}
