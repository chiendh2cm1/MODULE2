package com.codegym.view;

import com.codegym.controller.UserManagement;
import com.codegym.model.User;

import java.util.Scanner;

public class LoginMenu {
    public static Scanner sc = new Scanner(System.in);
    private UserManagement userManagement = new UserManagement();
    private ManagementMenu managementMenu = new ManagementMenu();
    public void run() {
        int choice;
        boolean flag = true;
        while (flag) {
            try {
                do {
                    System.out.println();
                    System.out.println("\t\t\t\t\t\t\t##********** ỨNG DỤNG QUẢN LÝ CỬA HÀNG BÁN HÀNG ONLINE **********##");
                    System.out.println("\t\t\t\t\t\t\t##>>>>>>>>>>>>>>>>>>>>>>>> 1. ĐĂNG NHẬP <<<<<<<<<<<<<<<<<<<<<<<<<##");
                    System.out.println("\t\t\t\t\t\t\t##>>>>>>>>>>>>>>>>>>>>>>>> 2. ĐĂNG KÝ <<<<<<<<<<<<<<<<<<<<<<<<<<<##");
                    System.out.println("\t\t\t\t\t\t\t##>>>>>>>>>>>>>>>>>>>>>>>> 3. ĐĂNG XUẤT <<<<<<<<<<<<<<<<<<<<<<<<<##>");
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
                            System.err.println("\n\t\t\t\t\t\t\t>>>>>>>>>>>>>>>>>>>>>>>>>> NHẬP TRONG KHOẢNG TỪ 0 ĐẾN 6 <<<<<<<<<<<<<<<<<<<<<<<<<<<");
                            break;
                    }
                } while (choice != 0);
            } catch (Exception e) {
                System.err.println("\n\t\t\t\t\t\t\t>>>>>>>>>>>>>>>>>>>>>>>>>>>>> XIN VUI LÒNG NHẬP SỐ <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
            }
        }
    }

    private void doRegister() {
        System.out.println("Đăng ký tài khoản mới!");
        String userName;
        String password;
        do {
            System.out.println("Nhập tên tài khoản: ");
            System.out.println("<Tài khoản phải có tối thiểu tám ký tự, ít nhất một chữ cái và một số>");
            userName = sc.nextLine();
        } while (!userManagement.validateUserName(userName) || userManagement.checkExistId(userName) || userName.equals("0"));
        do {
            System.out.print("Nhập nhập khẩu: ");
            System.out.println("< Tài khoản phải có tối thiểu tám ký tự, ít nhất một chữ cái viết hoa, một chữ cái viết thường và một số>");
            password = sc.nextLine();
        } while (!userManagement.validatePassWord(password));
        User user = new User(userName, password);
        userManagement.register(user);
    }

    private void doLogin() {
        System.out.println("Nhập tên người dùng: ");
        String username = sc.nextLine();
        System.out.println("Nhập mật khẩu: ");
        String password = sc.nextLine();
        User user = new User();
        boolean isLogin = userManagement.checkUserLogin(username, password);
        if (isLogin) {
            System.out.println("Đăng nhập thành công");
            managementMenu.run();
        } else {
            System.out.println("Tài khoản hoặc mật khẩu không đúng");
        }

    }
}
