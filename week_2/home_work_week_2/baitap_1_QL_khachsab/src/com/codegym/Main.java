package com.codegym;


import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HotelManagement hotelManagemnet = new HotelManagement();
        int choice;
        menu();
        do {
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 0:{
                }
                case 1: {
                    System.out.println("---Danh sách khách sạn---");
                    hotelManagemnet.displayAllHotel();
                    break;
                }
                case 2: {
                    System.out.println("---Thêm thông tin khách sạn---");
                    System.out.println("Nhập vị trí cần thêm: ");
                    int index = sc.nextInt();
                    if (index < 0 || index > hotelManagemnet.size()) {
                        System.out.println("Vị trí thêm không hợp lệ");
                    } else {
                        Hotel hotel = getHotel();
                        hotelManagemnet.addNewHotel(index, hotel);
                    }
                    break;
                }
                case 3: {
                    System.out.println("---Chỉnh sửa tin khách sạn---");
                    System.out.println("Nhập vị trí cần chỉnh sửa: ");
                    int index = sc.nextInt();
                    if (index < 0 || index >= hotelManagemnet.size()) {
                        System.out.println("Vị trí thêm không hợp lệ");
                    } else {
                        Hotel hotel = getHotel();
                        hotelManagemnet.updateHotel(index, hotel);
                    }
                    break;
                }
                case 4: {
                    System.out.println("---Xóa thông tin khách sạn---");
                    System.out.println("Nhập vị trí cần xóa: ");
                    int index = sc.nextInt();
                    if (index < 0 || index > hotelManagemnet.size()) {
                        System.out.println("Vị trí thêm không hợp lệ");
                    } else {
                        hotelManagemnet.removeHotel(index);
                    }
                    break;
                }
                case 5:{
                    System.out.println("---Tính tiền theo chứng minh nhân dân---");
                    sc.nextLine();
                    System.out.println("Nhập số chứng minh nhân dân cần thanh toán:");
                    String identity = sc.nextLine();
                    System.out.println("Số tiền cần thanh toán là: ");
                    System.out.println(hotelManagemnet.payment(identity) + " VND");
                    break;
                }
                default:{
                    System.out.println(" Mời bạn nhập tỏng khoảng từ 0 đến 5");
                }
            }
        } while (choice != 0);
    }

    private static Hotel getHotel() {
        Person person = getPerson();
        System.out.println("Nhập số ngày trọ:");
        int rentdays = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập loại phòng trọ:");
        String type = sc.nextLine();
        System.out.println(" Nhập giá phòng:");
        double price = sc.nextDouble();
        return new Hotel(rentdays, type, price, person);
    }

    private static Person getPerson() {
        sc.nextLine();
        System.out.println("Nhập thông tin khách trọ");
        System.out.println("Nhập tên khách trọ:");
        String name = sc.nextLine();
        System.out.println("Nhập ngày sinh:");
        String dateOfBirth = sc.nextLine();
        System.out.println("Nhập chứng minh nhân dân:");
        String indentity = sc.nextLine();
        return new Person(name, dateOfBirth, indentity);
    }

    private static void menu() {
        System.out.println("---Menu quản lý khách sạn");
        System.out.println("1. Hiển thị tất cả thông tin");
        System.out.println("2. Thêm thông tin khách sạn");
        System.out.println("3. Cập nhập thông tin khách sạn");
        System.out.println("4. Xóa thông tin khách sạn");
        System.out.println("5. Tính tiền theo Chứng minh thư");
        System.out.println("0. Thoát chương trình");
    }
}