package com.codegym.view;

import com.codegym.controller.UserManagement;
import com.codegym.model.User;

import java.util.Scanner;

public class LoginMenu {
    public static Scanner sc = new Scanner(System.in);
    private final UserManagement userManagement = new UserManagement();
    private final ManagementStaffMenu managementStaffMenu = new ManagementStaffMenu();
    private final ManagementOwnerMenu managementOwnerMenu = new ManagementOwnerMenu();
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_RESET = "\u001B[0m";
    public void run() {
        int choice;
        boolean flag = true;
        while (flag) {
            try {
                do {
                    System.out.println();
                    System.out.println("\t\t\t\t\t\t\t##============================== QUẢN LÝ CỬA HÀNG ==============================##");
                    System.out.println("\t\t\t\t\t\t\t##**************** ỨNG DỤNG QUẢN LÝ CỬA HÀNG BÁN HOA LỤA ONLINE ****************##");
                    System.out.println("\t\t\t\t\t\t\t##******************************** 1. ĐĂNG NHẬP ********************************##");
                    System.out.println("\t\t\t\t\t\t\t##******************************** 2. ĐĂNG KÝ **********************************##");
                    System.out.println("\t\t\t\t\t\t\t##******************************** 0. ĐĂNG XUẤT ********************************##");
                    System.out.print("\t\t\t\t\t\t\tNhập vào lựa chọn của bạn: ");
                    choice = Integer.parseInt(sc.nextLine());
                    switch (choice) {
                        case 1:
                            doLogin();
                            break;
                        case 2:
                            doRegister();
                            break;
                        case 0:
                            flag = false;
                            break;
                        default:
                            System.out.println(TEXT_RED+"\n\t\t\t\t\t\t\t------------------------> NHẬP TRONG KHOẢNG TỪ 0 ĐẾN 2 <--------------------------"+TEXT_RESET);
                            break;
                    }
                } while (choice != 0);
            } catch (Exception e) {
                System.out.println(TEXT_RED+"\n\t\t\t\t\t\t\t----------------------------> XIN VUI LÒNG NHẬP SỐ <------------------------------"+TEXT_RESET);
            }
        }
    }

    private void doRegister() {
        System.out.println("Đăng ký tài khoản mới!");
        System.out.println("Nhập keyWord được cấp: ");
        String keyWord = sc.nextLine();
        if (keyWord.equals("thaibinhchaoban")) {
            String userName;
            String password;
            String role;
            do {
                System.out.println("Nhập tên tài khoản: ");
                System.out.println("<Tài khoản phải có tối thiểu tám ký tự, ít nhất một chữ cái và một số>");
                userName = sc.nextLine();
            } while (!userManagement.validateUserName(userName) || userManagement.checkExistId(userName) || userName.equals("0"));
            do {
                System.out.print("Nhập nhập khẩu: ");
                System.out.println("< Mật khẩu phải có tối thiểu tám ký tự, ít nhất một chữ cái viết hoa, một chữ cái viết thường và một số>");
                password = sc.nextLine();
            } while (!userManagement.validatePassWord(password));
            do {
                System.out.println("Tài khoản này được tạo cho: ");
                System.out.println("<Chỉ được chọn ROLE_STAFF hoặc ROLE_OWNER>");
                role = sc.nextLine();
            } while (!role.equals("ROLE_STAFF") && !role.equals("ROLE_OWNER"));
            System.out.println("Tạo tài khoản thành công!!!");
            User user = new User(userName, password, role);
            userManagement.register(user);
        } else {
            System.out.println(TEXT_RED+"Incorrect keyword!!!!!!!"+TEXT_RESET);
        }
    }

    private void doLogin() {
        System.out.println("Nhập tên tài khoản: ");
        String username = sc.nextLine();
        System.out.println("Nhập mật khẩu: ");
        String password = sc.nextLine();
        System.out.println("ROLE_STAFF/ROLE_OWNER");
        String role = sc.nextLine();
        boolean isLogin = userManagement.checkLogin(username, password, role);
        if (isLogin && role.equals("ROLE_OWNER")) {
            System.out.println("\n\t\t\t\t\t\t\t*******************************>>SUCCESSFUL LOGIN<<*******************************\n");
            managementOwnerMenu.run();
        } else if (isLogin && role.equals("ROLE_STAFF")) {
            managementStaffMenu.run();
        } else {
            System.out.println(TEXT_RED+"Đăng nhập không thành công!!!"+TEXT_RESET);
        }
    }
}
