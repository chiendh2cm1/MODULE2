package com.codegym;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        TeacherManagement teacherManagement = new TeacherManagement();
        menu();
        int choice;
        do {
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("---Thêm cán bộ giáo viên vào danh sách---");
                    System.out.println("Nhập thông tin của cán bộ giáo viên: ");
                    TeacherStaff teacherStaff = getTeacherStaff();
                    teacherManagement.addTeacherStaff(teacherStaff);
                    break;
                }
                case 2: {
                    System.out.println("---Hiển thị thông tin---");
                    teacherManagement.showLish();
                    break;
                }
                case 3: {
                    System.out.println("---Xóa cán bộ giáo viên khỏi danh sách---");
                    System.out.println("Nhập vị trí cần xóa: ");
                    int index = sc.nextInt();
                    if (index < 0 || index > teacherManagement.size() - 1) {
                        System.out.println("Không tìm thấy vị trí cần xóa.");
                    } else {
                        teacherManagement.removeTeacherStaff(index);
                    }
                    break;
                }
                case 4: {
                    System.out.println("---Thay đổi thông tin cán bộ giáo viên---");
                    System.out.println("NHập vị trí cần thay đổi: ");
                    int index = sc.nextInt();
                    if (index < 0 || index > teacherManagement.size() - 1) {
                        System.out.println("Không tìm thấy vị trí cần thay đổi.");
                    } else {
                        System.out.println("Nhập thông tin thay đổi.");
                        TeacherStaff teacherStaff = getTeacherStaff();
                        teacherManagement.updateTeacherStaff(index, teacherStaff);
                    }
                    break;
                }
                case 5: {
                    System.out.println("---Hiển thị các cán bộ giáo viên có lương trên 80 triệu: ");
                    teacherManagement.showTeacherStaffIsPayMore80();
                    break;
                }
                case 0: {
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Vui lòng lựa chọn từ 0 đến 5.");
                }
            }
        } while (choice >= 0 && choice < 6);
    }

    private static void menu() {
        System.out.println("---Quản lý cán bộ giáo viên---");
        System.out.println("1. Thêm cán bộ giáo viên vào danh sách.");
        System.out.println("2. Hiển thị thông tin.");
        System.out.println("3. Xóa cán bộ giáo viên khỏi danh sách.");
        System.out.println("4. Thay đổi thông tin cán bộ giáo viên");
        System.out.println("5. Hiển thị các cán  bộ có lương trên 80 triệu.");
        System.out.println("0. Thoát chương trình.");
    }

    private static TeacherStaff getTeacherStaff() {
        sc.nextLine();
        System.out.println("Nhập tên:");
        String name = sc.nextLine();
        System.out.println("Nhập  ngày sinh: ");
        String strDateOfBirth = sc.nextLine();
        Date dateOfBirth = strToDate(strDateOfBirth);
        System.out.println("Nhập địa chỉ: ");
        String adress = sc.nextLine();
        System.out.println("Nhập lương cứng: ");
        double hardpay = sc.nextDouble();
        System.out.println("nhập lương thưởng: ");
        double bonusPay = sc.nextDouble();
        System.out.println("Nhập tiền phạt: ");
        double punishPay = sc.nextDouble();
        return new TeacherStaff(name, dateOfBirth, adress, hardpay, bonusPay, punishPay);
    }

    public static Date strToDate(String strDate) {
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = sdf.parse(strDate);
        } catch (ParseException e) {
            System.out.println("Lỗi định dạng  ngày tháng");
        }
        return date;
    }
}
