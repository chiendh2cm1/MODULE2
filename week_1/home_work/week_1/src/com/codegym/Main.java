package com.codegym;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int ProductAmount;
        System.out.print(" Nhập số lượng sản phẩm: ");
        Scanner sc = new Scanner(System.in);
        ProductAmount = sc.nextInt();
        Product[] productsLish = new Product[ProductAmount];
        for (int i = 0; i < productsLish.length; i++) {
            productsLish[i] = new Product();
            System.out.println("nhập sản phẩm thứ " + (i + 1));
            productsLish[i].inputProduct();
        }
        int choice;// nhập giá trị của người dùng.
        do {
            menu();
            System.out.println("Mời bạn nhập lựa chọn: ");
            choice = sc.nextInt();
            switch (choice) {

                case 1: {
                    if (productsLish.length == 0) {
                        System.out.println("Không có sản phẩm nào");
                    } else {
                        displayProductLish(productsLish);
                    }
                    break;
                }
                case 2: {
                    System.out.println("---Thêm sản phẩm---");
                    System.out.println("\nNhập thông tin sản phẩm: ");
                    Product productNew = new Product();
                    productNew.inputProduct();
                    System.out.print("\nNhập vị trí cần thêm: ");
                    int indexNew = sc.nextInt();
                    if (indexNew < 0 || indexNew > productsLish.length) {
                        System.out.println(" không thêm được sản phẩm");
                    } else {
                        productsLish = insertProduct(productsLish, productNew, indexNew);
                        displayProductLish(productsLish);
                    }
                    break;
                }
                case 3: {
                    System.out.println("---Cập nhật sản phẩm---");
                    System.out.println("nhập vị trí cần chỉnh sửa: ");
                    int index = sc.nextInt();
                    if (index < 0 || index > productsLish.length) {
                        System.out.println(" Vị trí không hợp lệ");
                    } else {
                        System.out.println("Cập nhập thông tin sản phẩm: ");
                        Product productAccess = new Product();
                        productAccess.inputProduct();
                        productsLish[index] = productAccess;
                    }
                    break;
                }
                case 4: {
                    System.out.println("---Xóa sản phẩm---");
                    sc.nextLine();
                    System.out.println("\nNhập tên sản phẩm cần xóa: ");
                    String name = sc.nextLine();
                    int indexDel = searchProduct(productsLish, name);
                    if (indexDel == -1) {
                        System.out.println("Không có sản phẩm trong mảng");
                    } else {
                        productsLish = deleteProduct(productsLish, indexDel);
                        displayProductLish(productsLish);
                    }
                    break;
                }
                case 5: {
                    System.out.println("---Sắp xếp sản phẩm theo tên---");
                    sort(productsLish);
                    break;
                }
                case 6: {
                    System.out.println("---Tìm kiếm sản phẩm theo tên");
                    sc.nextLine();
                    System.out.println("nhập tên của sản phẩm cần tìm: ");
                    String name = sc.nextLine();
                    int index = searchProduct(productsLish, name);
                    if (index == -1) {
                        System.out.println("Không tìm thấy sản phẩm");
                    } else {
                        productsLish[index].display();
                    }
                    break;
                }
                default: {
                    System.out.println("Số nhập vào phải trong khoảng 0 -> 6");
                    break;
                }
            }
        } while (choice != 0);
    }

    public static Product[] insertProduct(Product[] arr, Product product, int index) {
        Product[] newProdutsLish = new Product[arr.length + 1];
        for (int i = 0; i < newProdutsLish.length; i++) {
            if (i < index) {
                newProdutsLish[i] = arr[i];
            } else if (i == index) {
                newProdutsLish[index] = product;
            } else {
                newProdutsLish[i] = arr[i - 1];
            }
        }
        return newProdutsLish;
    }

    public static int searchProduct(Product productsLish[], String name) {
        int index = -1;
        for (int i = 0; i < productsLish.length; i++) {
            if (productsLish[i].getName().equalsIgnoreCase(name)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static Product[] deleteProduct(Product productsLish[], int index) {
        Product[] newProdutsLish = new Product[productsLish.length - 1];
        for (int i = 0; i < newProdutsLish.length; i++) {
            if (i < index) {
                newProdutsLish[i] = productsLish[i];
            } else {
                newProdutsLish[i] = productsLish[i + 1];
            }
        }
        return newProdutsLish;
    }

    public static void menu() {
        System.out.println("\n---MENU QUẢN LÝ SẢN PHẨM---");
        System.out.println("1. Hiển thị danh sách sản phẩm");
        System.out.println("2. Thêm sản phẩm");
        System.out.println("3. Cập nhật sản phẩm");
        System.out.println("4. Xóa sản phẩm");
        System.out.println("5. Sắp xếp danh sách sản phẩm");
        System.out.println("6. Tìm kiếm sản phẩm theo tên");
        System.out.println("0. Thoát chương trình");
    }

    public static void displayProductLish(Product[] productsLish) {
        System.out.println("----------Danh sách sản phẩm--------- ");
        System.out.printf("\n%-5s %-20s %-20s %-20s", "id", "name", "price", "description");
        for (int i = 0; i < productsLish.length; i++) {
            productsLish[i].display();
        }
    }

    public static void sort(Product[] productsLish) {
        for (int i = 0; i < productsLish.length; i++) {
            for (int j = 0; j < productsLish.length; j++) {
                if (productsLish[i].getName().compareTo(productsLish[j].getName()) > 0) {
                    Product temp = productsLish[i];
                    productsLish[i] = productsLish[j];
                    productsLish[j] = temp;
                }
            }
        }
        displayProductLish(productsLish);
    }
    
}
