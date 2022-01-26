package com.codegym;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        DocumentManagement documentManagement = new DocumentManagement();

        System.out.println("---Quản lý tài liệu---");
        System.out.println("1. Nhập danh sách quản lý tại liệu.");
        System.out.println("2 .Hiển thị danh sách tài liệu.");
        System.out.println("3. Thêm tài liệu vào danh sách.");
        System.out.println("4. Tìm tài liệu theo mã.");
        System.out.println("5. TÌm tài liệu theo loại tài liệu.");
        System.out.println("0. Thoát chương trình.");
        int choice;
        do {
            System.out.println("Nhập lựa chon của bạn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                }
                case 2: {
                    System.out.println("Hiển thị danh sách tài liệu: ");
                    documentManagement.display();
                    break;
                }
                case 3: {
                    System.out.println("Thêm tài liệu vào danh sách: ");
                    Document document = new Document();
                    System.out.println("Nhập vị trí cần thêm: ");
                    int index = sc.nextInt();
                    documentManagement.addDocument(index, document);
                    break;
                }
                case 4: {
                    System.out.println("Tìm tài liệu theo mã: ");
                    System.out.println("Nhập mã tài liệu cần tìm:");
                    String code = sc.nextLine();
                    documentManagement.searchByCode(code);
                    break;
                }
                case 5: {
                    System.out.println("TÌm tài liệu theo loại tài liệu: ");
                    System.out.println("Nhập loại tài liêu");
                    String typeOfDocument = sc.nextLine();
                    documentManagement.searchByDocumentType(typeOfDocument);
                    break;
                }
            }
        } while (choice >= 0 && choice < 6);
    }

    public static Date strToDate(String strDate) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = sdf.parse(strDate);
        } catch (ParseException e) {
            System.out.println("Nhập sai định dạng ngày tháng!!!");
        }
        return date;
    }
}
