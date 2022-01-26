package com.codegym;

import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Studentmanagement studentmanagement = new Studentmanagement();
        menu();
        int choice;
        do {
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("---Hiển thị danh sách sinh viên---");
                    studentmanagement.showStudentList();
                    break;
                }
                case 2: {
                    System.out.println("---Thêm sinh viên---");
                    System.out.println("Nhập vị trí cần thêm: ");
                    int index = sc.nextInt();
                    if (index < 0 || index > studentmanagement.size()) {
                        System.out.println("Vị trí cần thêm không tồn tại.");
                    } else {
                        Student student = getStudent();
                        studentmanagement.addStudent(index, student);
                    }
                    break;
                }
                case 3: {
                    System.out.println("---Sửa thông tin sinh viên---");
                    System.out.println("Nhập vị trí cần chỉnh sửa: ");
                    int index = sc.nextInt();
                    if (index < 0 || index > studentmanagement.size()) {
                        System.out.println("Vị trí cần thêm không tồn tại.");
                    } else {
                        Student student = getStudent();
                        studentmanagement.update(index, student);
                    }
                    break;
                }
                case 4: {
                    System.out.println("---Xóa thông tin sinh viên---");
                    System.out.println("Nhập vị trí cần xóa: ");
                    int index = sc.nextInt();
                    if (index < 0 || index > studentmanagement.size()) {
                        System.out.println("Vị trí cần xóa không tồn tại.");
                    } else {
                        studentmanagement.removeStudent(index);
                    }
                    break;
                }
                case 5: {
                    System.out.println("---Sắp xếp sinh viên theo điểm số---");
                    studentmanagement.sortStuden(sc);
                    break;
                }
                case 6: {
                    System.out.println("---Tìm kiếm sinh viên theo mã sinh viên---");
                    System.out.println("Nhập má sinh viên cần tìm kiếm: ");
                    String studentCode = sc.nextLine();
                    studentmanagement.search(studentCode, sc);
                    break;
                }
            }
        } while (choice >= 0 && choice < 7);
    }

    private static void menu() {
        System.out.println("---Quản lý sinh viên---");
        System.out.println("1. Hiển thị danh sách.");
        System.out.println("2. Thêm sinh viên.");
        System.out.println("3. Sửa thông tin sinh viên.");
        System.out.println("4. Xóa thông tin sinh viên.");
        System.out.println("5. Sắp xếp sinh viên theo điểm số.");
        System.out.println("6. Tìm kiếm theo mã sinh viên");
    }

    private static Student getStudent() {
        sc.nextLine();
        System.out.println("Nhập mã sinh viên: ");
        String studentCode = sc.nextLine();
        System.out.println("Nhập tên sinh viên: ");
        String name = sc.nextLine();
        System.out.println("Nhập địa chỉ sinh viên: ");
        String adress = sc.nextLine();
        System.out.println("Nhập lớp: ");
        String classRoom = sc.nextLine();
        System.out.println("Nhập điểm số:");
        double poin = sc.nextDouble();
        return new Student(studentCode, name, adress, classRoom, poin);
    }
}
