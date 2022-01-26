package com.codegym;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HRM hrm = new HRM();
        menu();
        int choice;
        do {
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1: {
                    addCadresInHrm(hrm);
                    break;
                }
                case 2: {
                    System.out.println("---Hiển thị danh sách cán bộ---");
                    hrm.showCadresList();
                    break;
                }
                case 3: {
                    System.out.println("---Tìm kiếm thông tin cán bộ theo tên---");
                    System.out.println("Nhập tên cán bộ cần tìm kiếm: ");
                    String name = sc.nextLine();
                    System.out.println(" Thông tin của cán bộ: ");
                    hrm.searchCadres(name);
                    break;
                }
                case 4: {
                    System.out.println("--- Xóa thông tin cán bộ---");
                    System.out.println("Nhập vị trí cần xóa: ");
                    int index = sc.nextInt();
                    if (index < 0 || index > hrm.SIZE()) {
                        System.out.println("Không tìm thấy cán bộ cần xóa.");
                    } else {
                        hrm.remove(index);
                    }
                    break;
                }
                case 0: {
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Xin vui lòng nhập trong khoảng từ 0 đến 4.");
                    break;
                }
            }
        } while (choice < 0 || choice > 5);

    }

    private static void addCadresInHrm(HRM hrm) {
        System.out.println("---Thêm cán bộ vào danh sách---");
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Nhập ngày tháng năm sinh: ");
        String strDateOfBirth = sc.nextLine();
        Date dateOfBirth = strToDate(strDateOfBirth);
        System.out.println("Nhập giới tính: ");
        String sex = sc.nextLine();
        System.out.println("Nhập địa chỉ:");
        String adress = sc.nextLine();
        int choice2;
        Cadres cadres = new Cadres();
        do {
            System.out.println("Cán bộ bạn cần nhập là: (1.Kĩ sư; 2.Công nhân; 3.Nhân viên; 0.Thoát)");
            choice2 = sc.nextInt();
            switch (choice2) {
                case 1:
                    sc.nextLine();
                    System.out.println("Nhập ngành đào tạo cần quản lý: ");
                    String trainingIndustry = sc.nextLine();
                    cadres = new Engineer(name, dateOfBirth, sex, adress, trainingIndustry);
                    hrm.addCadres(cadres);
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Nhập bậc nghề: ");
                    String tier = sc.nextLine();
                    cadres = new Worker(name, dateOfBirth, sex, adress, tier);
                    hrm.addCadres(cadres);
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Nhập công viêc: ");
                    String work = sc.nextLine();
                    cadres = new Staff(name, dateOfBirth, sex, adress, work);
                    hrm.addCadres(cadres);
                    break;
            }
        } while (choice2 < 0 || choice2 > 3);
    }

    private static void menu() {
        System.out.println("---QUẢN LÝ CÁN BỘ---");
        System.out.println("1. Thêm cán bộ vào danh sách.");
        System.out.println("2. Hiển thị danh sách quản lý.");
        System.out.println("3. Tìm kiếm thông tin cán bộ theo tên.");
        System.out.println("4. Xóa cán bộ khỏi danh sách.");
        System.out.println("0. Thoát chương trình.");
    }

    public static Date strToDate(String strDate) {
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
