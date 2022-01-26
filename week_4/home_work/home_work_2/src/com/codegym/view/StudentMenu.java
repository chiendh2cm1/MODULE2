package com.codegym.view;

import com.codegym.controller.StudentManagement;
import com.codegym.model.Student;

import java.util.Scanner;

public class StudentMenu {
    public static Scanner scanner = new Scanner(System.in);

    public void run() {
        StudentManagement studentManagement = new StudentManagement();
        int choice = -1;
        do {
            menu();
            System.out.println("Nhập lựa chọn của bạn");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1: {
                    showAllStudent(studentManagement);
                    break;
                }
                case 2: {
                    showCreateStudent(studentManagement);
                    break;
                }
                case 3: {
                    showUpdateStudent(studentManagement);
                    break;
                }
                case 4: {
                    showDeleteStudent(studentManagement);
                    break;
                }
                case 5: {
                    showSortStudent(studentManagement);
                    break;
                }
                case 6: {
                    System.out.println("Tìm kiếm học viên");
                    int choiceFind = -1;
                    do {
                        menuFind();
                        System.out.println("Nhập lựa chọn của bạn:");
                        choiceFind = scanner.nextInt();
                        switch (choiceFind) {
                            case 1: {
                                System.out.println("Tìm kiếm tuyến tính");
                                System.out.println("Nhập mã học viên cần tìm");
                                scanner.nextLine();
                                String id = scanner.nextLine();
                                int index = studentManagement.findStudentById(id);
                                if (index != -1) {
                                    System.out.println("Thông tin học viên cần tìm: " + studentManagement.getById(id));
                                } else {
                                    System.out.println("Không tìm thấy");
                                }
                                break;
                            }
                            case 2: {
                                System.out.println("Tìm kiếm nhị phân");
                                System.out.println("Nhập mã học viên cần tìm");
                                scanner.nextLine();
                                String id = scanner.nextLine();
                                int index = studentManagement.findStudentUsingBinarySearch(id);
                                if (index != -1) {
                                    System.out.println("Thông tin học viên cần tìm: " + studentManagement.getById(id));
                                } else {
                                    System.out.println("Không tìm thấy");
                                }
                                break;
                            }
                        }
                    } while (choiceFind != 0);
                }
            }
        } while (choice != 0);
    }

    private static void menuFind() {
        System.out.println("1. Sử dụng tìm kiếm tuyến tính");
        System.out.println("2. Sử dụng tìm kiếm nhị phân");
        System.out.println("0. Quay lại");
    }

    private static void showSortStudent(StudentManagement studentManagement) {
        System.out.println("Sắp xếp danh sách học viên");
        int choiceSort = -1;
        do {
            menuSort();
            System.out.println("Nhập lựa chọn");
            choiceSort = scanner.nextInt();
            switch (choiceSort) {
                case 1: {
                    System.out.println("Sắp xếp nổi bọt");
                    studentManagement.bubbleSort();
                    break;
                }
                case 2: {
                    System.out.println("Sắp xếp chọn");
                    studentManagement.selectionSort();
                    break;
                }
                case 3: {
                    System.out.println("Sắp xếp chèn");
                    studentManagement.insertionSort();
                    break;
                }
            }
        } while (choiceSort != 0);
    }

    private static void menuSort() {
        System.out.println("1. Sắp xếp nổi bọt");
        System.out.println("2. Sắp xếp chọn");
        System.out.println("3. Sắp xếp chèn");
        System.out.println("0. Quay lại");
    }

    private static void showDeleteStudent(StudentManagement studentManagement) {
        System.out.println("Xóa thông tin học viên");
        System.out.println("Nhập mã học viên cần chỉnh sửa thông tin");
        String id = scanner.nextLine();
        boolean isDeleted = studentManagement.deleteById(id);
        if (isDeleted) {
            System.out.println("Xóa thành công!");
        } else {
            System.out.println("Xóa lỗi do mã học viên không tồn tại!");
        }
    }

    private static void showUpdateStudent(StudentManagement studentManagement) {
        System.out.println("Chỉnh sửa thông tin học viên");
        System.out.println("Nhập mã học viên cần chỉnh sửa thông tin");
        String id = scanner.nextLine();
        int index = studentManagement.findStudentById(id);
        if (index != -1) {
            Student student = inputStudentInfo();
            studentManagement.updateById(id, student);
            System.out.println("Cập nhật thành công!");
        } else {
            System.out.println("Cập nhật bị lỗi do không tồn tại mã học viên cần tìm!");
        }
    }

    private static void showCreateStudent(StudentManagement studentManagement) {
        System.out.println("Thêm học viên");
        Student student = inputStudentInfo();
        studentManagement.addNew(student);
    }

    private static void showAllStudent(StudentManagement studentManagement) {
        int size = studentManagement.size();
        if (size == 0) {
            System.out.println("Danh sách rỗng");
        } else {
            System.out.println("Danh sách học viên");
            studentManagement.displayAll();
        }
    }

    private static Student inputStudentInfo() {
        System.out.println("Nhập mã học viên:");
        String id = scanner.nextLine();
        System.out.println("Nhập tên học viên:");
        String name = scanner.nextLine();
        System.out.println("Nhập quê quán học viên:");
        String hometown = scanner.nextLine();
        System.out.println("Nhập lớp:");
        String className = scanner.nextLine();
        System.out.println("Nhập điểm:");
        double mark = scanner.nextInt();
        Student student = new Student(id, name, hometown, className, mark);
        return student;
    }

    private static void menu() {
        System.out.println("1. Hiển thị danh sách học viên");
        System.out.println("2. Thêm học viên mới");
        System.out.println("3. Cập nhật học viên");
        System.out.println("4. Xóa");
        System.out.println("5. Sắp xếp điểm giảm dần");
        System.out.println("6. Tìm kiếm");
        System.out.println("0. Quay lại");
    }
}