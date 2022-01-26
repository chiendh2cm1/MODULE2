package com.codegym;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        menu();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1: {
                    System.out.println("---Thêm sản phẩm---");
                    Product product = getProduct(sc);
                    productManager.addProduct(product);
                    break;
                }
                case 2: {
                    System.out.println("---Sửa thông tin sản phẩm theo ID---");
                    System.out.println("Nhập ID của sản phẩm cần chỉnh sửa");
                    String ID = sc.nextLine();
                    int index = productManager.searchProductID(ID);
                    if (index == -1) {
                        System.out.println("Không tìm được ID sản phẩm");
                    } else {
                        Product product = getProduct(sc);
                        productManager.updateProduct(index, product);
                    }
                    break;
                }
                case 3: {
                    System.out.println("---Hiển thị danh sách tên sản phẩm---");
                    productManager.ShowProductList();
                    break;
                }
                case 4: {
                    System.out.println("---Tìm kiếm sản phẩm theo tên---");
                    System.out.println("Nhập tên sản phẩm cần tìm kiếm: ");
                    String name = sc.nextLine();
                    productManager.searchProduct(name);
                    break;
                }
                case 5: {
                    System.out.println("---Xóa sản phẩm theo ID");
                    System.out.println("Nhập ID của sản phẩm cần x");
                    String ID = sc.nextLine();
                    int index = productManager.searchProductID(ID);
                    if (index == -1) {
                        System.out.println("Không tìm được ID sản phẩm");
                    } else {
                        productManager.removeProduct(index);
                    }
                    break;
                }
                case 6: {
                    System.out.println("--- Sắp xếp sản phẩm theo thứ tự tăng dần theo giá");
                    productManager.sortProductAscending();
                }
                case 0: {
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Vui lòng nhập trong khoảng 0 đến 6");
                }

            }
        } while (choice >= 0 && choice < 7);
    }

    private static void menu() {
        System.out.println("---CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM---");
        System.out.println("1. thêm sản phẩm");
        System.out.println("2. Sửa thông tin sản phẩm theo ID");
        System.out.println("3. Hiển thị danh sách sản phẩm");
        System.out.println("4. Tìm kiếm sản phẩn theo tên");
        System.out.println("5. Xóa sản phẩm theo ID");
        System.out.println("6. Sắp xếp sản phẩm tăng giảm dần theo giá");
        System.out.println("0. THoát chương trình");
    }

    private static Product getProduct(Scanner sc) {
        System.out.println("Nhập tên sản phẩm: ");
        String name = sc.nextLine();
        System.out.println("Nhập giá sản phẩm:");
        double price = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhập ID sản phẩm:");
        String ID = sc.nextLine();
        System.out.println("Nhập mô tả sản phẩm:");
        String description = sc.nextLine();
        return new Product(name, price, ID, description);
    }
}