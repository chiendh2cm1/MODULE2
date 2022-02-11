package com.codegym.view;

import com.codegym.controller.StaffManagement;
import com.codegym.model.Staff;

import java.util.Scanner;

public class StaffMenu {
    public static Scanner sc = new Scanner(System.in);
    private final StaffManagement staffManagement = new StaffManagement();

    public void run() {
        StaffManagement staffManagement = new StaffManagement();
        int choice;
        boolean flag = true;
        while (flag) {
            try {
                do {
                    staffMenu();
                    System.out.print("\t\t\t\t\t\t\tNhập vào lựa chọn của bạn: ");
                    choice = Integer.parseInt(sc.nextLine());
                    switch (choice) {
                        case 1:
                            showAllStaff(staffManagement);
                            break;
                        case 2:
                            showCreatStaff(staffManagement);
                            break;
                        case 3:
                            showUpdateStaff(staffManagement);
                            break;
                        case 4:
                            showFindStaffInfo(staffManagement);
                            break;
                        case 5:
                            showDeleteStaff(staffManagement);
                            break;
                        case 0:
                            flag = false;
                            break;
                        default:
                            System.err.println("\n\t\t\t\t\t\t\t>>>>>>>>>>>>>>>>>>>>>>>>>> NHẬP TRONG KHOẢNG TỪ O ĐẾN 5 <<<<<<<<<<<<<<<<<<<<<<<<<<<");
                            break;
                    }
                } while (choice != 0);
            } catch (Exception e) {
                System.err.println("\n\t\t\t\t\t\t\t>>>>>>>>>>>>>>>>>>>>>>>>>>>>> XIN VUI LÒNG NHẬP SỐ <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
            }
        }
    }

    private static void showDeleteStaff(StaffManagement staffManagement) {
        System.out.println("*****Xóa nhân viên*****");
        System.out.println("Nhập tên nhân viên cần xóa: ");
        String deletename = sc.nextLine();
        int choice1;
        System.out.println("1. Xác nhận xoá");
        System.out.println("0. Không xoá");
        System.out.print("Nhập vào lựa chọn của bạn: ");
        choice1 = Integer.parseInt(sc.nextLine());
        if (choice1 == 1) {
            boolean isDeleted = staffManagement.deleteById(deletename);
            if (isDeleted) {
                System.out.println("Xóa thành công");
            } else {
                System.err.println("Lỗi do tên nhân viên không tồn tại");
            }
        }
    }

    private static void staffMenu() {
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t##============================== QUẢN LÝ NHÂN VIÊN =============================##");
        System.out.println("\t\t\t\t\t\t\t|| 1. Hiển thị danh sách sách nhân viên   || 4. Tìm kiếm nhân viên theo tên     ||");
        System.out.println("\t\t\t\t\t\t\t|| 2. Thêm nhân viên mới                  || 5. Xóa nhân viên                   ||");
        System.out.println("\t\t\t\t\t\t\t|| 3. Sửa đổi thông tin nhân viên         || 0. Quay lại                        ||");
        System.out.println("\t\t\t\t\t\t\t##====================================(^^^^)====================================##");
    }

    private static void showAllStaff(StaffManagement staffManagement) {
        System.out.println("*****Hiển thị danh sách nhân viên*****");
        int size = staffManagement.size();
        if (size == 0) {
            System.err.println("Danh sách rỗng");
        } else {
            staffManagement.displayAll();
        }
    }

    private static void showFindStaffInfo(StaffManagement staffManagement) {
        System.out.println("*****Tìm kiếm nhân viên theo tên*****");
        System.out.println("Nhập tên nhân viên cần tìm kiếm thông tin: ");
        String staffName = sc.nextLine();
        int index = staffManagement.findStaffByname(staffName);
        if (index != -1) {
            System.out.println(" Thông tin nhân viên cần tìm là:");
            System.out.println(staffManagement.getByName(staffName));
        } else {
            System.err.println("Không tìm thấy sản phẩm");
        }
    }

    private static void showUpdateStaff(StaffManagement staffManagement) {
        System.out.println("*****Chỉnh sửa thông tin nhân viên*****");
        System.out.println("Nhập tên nhân viên cần chỉnh sửa");
        String updateName = sc.nextLine();
        int index = staffManagement.findStaffByname(updateName);
        if (index != -1) {
            Staff staff = inputStaffInfo();
            staffManagement.updateById(updateName, staff);
        } else {
            System.err.println("Cập nhập bị lỗi do không tìm thấy mã nhân viên");
        }
    }

    private static void showCreatStaff(StaffManagement staffManagement) {
        System.out.println("*****Thêm nhân viên*****");
        Staff staff = inputStaffInfo();
        staffManagement.addNew(staff);
    }

    private static Staff inputStaffInfo() {
        System.out.println("Nhập mã nhân viên: ");
        String staffId = sc.nextLine();
        System.out.println("Nhập tên nhân viện: ");
        String staffName = sc.nextLine();
        System.out.println("Nhập tuối nhân viên: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập số điện thoại: ");
        String phoneNumber = sc.nextLine();
        System.out.println("Nhập tiền công theo giờ: ");
        double wage = sc.nextDouble();
        sc.nextLine();
        return new Staff(staffId, staffName, age, phoneNumber, wage);
    }
}
