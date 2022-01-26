package com.codegym;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        LibraryCardManagement libraryCardManagement = new LibraryCardManagement();
        System.out.println("---Quản lý thư viện---");
        System.out.println("1. Hiển thị danh sách quản lý");
        System.out.println("2. Nhập thông tin sinh viên mượn sách");
        System.out.println("3. Tìm thông tin về 1 sinh viên mượn sách");
        System.out.println("4. Xóa thông tin sinh viên mượn sách");
        System.out.println("5. Cập nhập thông tin sinh viên mượn sách");
        System.out.println("6. Danh sách tên sinh viên mượn sách cần trả vào cuối tháng");
        System.out.println("0. Thoát chương trình");
        int choice;
        do {
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("---Hiển thị danh sách quản lý---");
                    libraryCardManagement.displayArrayList();
                    break;
                }
                case 2: {
                    System.out.println("---Nhập thông tin sinh viên mượn sách---");
                    inputLibraryCard(libraryCardManagement);
                    break;
                }
                case 3: {
                    System.out.println("--Tìm thông tin về 1 sinh viên mượn sách---");
                    System.out.println("Nhập tên sinh viên cần tìm kiếm: ");
                    String name = sc.nextLine();
                    libraryCardManagement.searchLibraryCardOfArrayList(name);
                }
                case 4: {
                    System.out.println("--Xóa thông tin sinh viên---");
                    removeLibraryCard(libraryCardManagement);
                    break;
                }

                case 5: {
                    System.out.println("---cập nhập thông tin về sinh viên mượn sách---");
                    updatelibraryCard(libraryCardManagement);
                    break;
                }
                case 6: {
                    System.out.println("---Danh sách tên sinh viên mượn sách cần trả vào cuối tháng---");
                    libraryCardManagement.displayListUserPayBookLastMonth();
                }
                default: {
                    System.out.println(" Số bạn nhập phải trong khoảng 0 đến 6!!!");
                }
                case 0: {
                    System.exit(0);
                    break;
                }

            }
        } while (choice >= 0 && choice < 7);
    }

    private static void updatelibraryCard(LibraryCardManagement libraryCardManagement) {
        System.out.println("Nhập vị trí cần chỉnh sửa: ");
        int index = sc.nextInt();
        sc.nextLine();
        Student student = getStudent();
        LibraryCard libraryCard = getLibraryCard(student);
        libraryCardManagement.updateArrayList(index, libraryCard);
    }

    private static void removeLibraryCard(LibraryCardManagement libraryCardManagement) {
        System.out.println("Nhập tên sinh viên cần xóa khỏi danh sách: ");
        String name = sc.nextLine();
        int flag = 0;
        for (LibraryCard libraryCard : libraryCardManagement.getLibraryCardArrayList()) {
            if (libraryCard.getStudent().getName().equalsIgnoreCase(name)) {
                libraryCardManagement.removeArrayList(libraryCard);
                flag++;
            }
        }
        if (flag == 0)
            System.out.println("Không có tên sinh viên cần xóa");
    }

    private static void inputLibraryCard(LibraryCardManagement libraryCardManagement) {
        System.out.println("Nhập vị trí cần thêm: ");
        int index = sc.nextInt();
        sc.nextLine();
        Student student = getStudent();
        LibraryCard libraryCard = getLibraryCard(student);
        libraryCardManagement.addLibraryCard(index, libraryCard);
    }

    private static LibraryCard getLibraryCard(Student student) {
        System.out.println("Nhập số phiếu mượn: ");
        String libraryCardNumber = sc.nextLine();
        System.out.println("Nhập ngày mượn sách:");
        String strBorrowedDate = sc.nextLine();
        Date borroweDate = strToDate(strBorrowedDate);
        System.out.println("Nhập ngày trả sách");
        String strReturnDate = sc.nextLine();
        Date returnDate = strToDate(strReturnDate);
        System.out.println("Nhập số hiệu của sách: ");
        String bookNumber = sc.nextLine();
        return new LibraryCard(libraryCardNumber, borroweDate, returnDate, bookNumber, student);
    }

    private static Student getStudent() {
        System.out.println("Nhập tên sinh viên: ");
        String name = sc.nextLine();
        System.out.println("Nhập mã sinh viên: ");
        String studentCode = sc.nextLine();
        System.out.println("Nhập ngày sinh: ");
        String dateOfBirth = sc.nextLine();
        System.out.println("Nhập tên lớp");
        String className = sc.nextLine();
        return new Student(name, studentCode, dateOfBirth, className);
    }


    private static Date strToDate(String strDate) {
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = sdf.parse(strDate);
        } catch (Exception e) {
            System.out.println("Lỗi định dạng ngày tháng!");
        }
        return date;
    }
}
