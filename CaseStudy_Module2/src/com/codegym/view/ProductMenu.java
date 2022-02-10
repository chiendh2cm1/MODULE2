package com.codegym.view;

import com.codegym.controller.ProductManagement;
import com.codegym.model.Product;

import java.util.Scanner;

public class ProductMenu {
    private ProductManagement productManagement = new ProductManagement();
    public static Scanner sc = new Scanner(System.in);

    public void run() {
        int choice;
        boolean flag = true;
        while (flag) {
            try {
                do {
                    System.out.println();
                    System.out.println("\t\t\t\t\t\t\t##============================== QUẢN LÝ SẢN PHẨM ==============================##");
                    System.out.println("\t\t\t\t\t\t\t|| 1. Hiển thị danh sách sách sản phẩm   || 5. Sắp xếp theo giá tăng dần      ||");
                    System.out.println("\t\t\t\t\t\t\t|| 2. Thêm sản phẩm mới                  || 6. Tìm kiếm sản phẩm              ||");
                    System.out.println("\t\t\t\t\t\t\t|| 3. Sửa đổi thông tin sản phẩm         || 7. Hiển thị sản phẩm theo danh mục||");
                    System.out.println("\t\t\t\t\t\t\t|| 4. Xóa sản phẩm                       || 0. Quay lại                       ||");
                    System.out.println("\t\t\t\t\t\t\t##====================================(^^^^)====================================##");
                    System.out.print("\t\t\t\t\t\t\tNhập vào lựa chọn của bạn: ");
                    choice = Integer.parseInt(sc.nextLine());
                    switch (choice) {
                        case 1:
                            showAllProduct(productManagement);
                            break;
                        case 2:
                            showCreatProduct(productManagement);
                            break;
                        case 3:
                            showUpdateProduct(productManagement);
                            break;
                        case 4:
                            showDeleteProduct(productManagement);
                            break;
                        case 5:
                            showSortProduct(productManagement);
                            break;
                        case 6:
                            showFindProduct(productManagement);
                            break;
                        case 7:
                            showProductByCategory(productManagement);
                            break;
                        case 0:
                            flag = false;
                            break;
                        default:
                            System.err.println("\n\t\t\t\t\t\t\t>>>>>>>>>>>>>>>>>>>>>>>>>> NHẬP TRONG KHOẢNG TỪ O ĐẾN 6 <<<<<<<<<<<<<<<<<<<<<<<<<<<");
                            break;
                    }
                } while (choice != 0);
            } catch (Exception e) {
                System.err.println("\n\t\t\t\t\t\t\t>>>>>>>>>>>>>>>>>>>>>>>>>>>>> XIN VUI LÒNG NHẬP SỐ <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
            }
        }
    }

    private static void showProductByCategory(ProductManagement productManagement) {
        System.out.println("Hiển thị sản phẩm theo danh mục");
        System.out.println("Chọn danh mục mà bạn muốn hiển thị sản phẩm:");
        String categoryName = sc.nextLine();
        productManagement.showProductByCategory(categoryName);
    }

    private static void showFindProduct(ProductManagement productManagement) {
        System.out.println("Tìm kiếm sản phẩm theo id");
        System.out.println("Nhập id sản phẩm cần tìm");
        String id = sc.nextLine();
        int index = productManagement.findProductById(id);
        if (index != -1) {
            System.out.println(" Thông tin sản phẩm cần tìm là:");
            System.out.println(productManagement.getById(id));
        } else {
            System.out.println("Không tìm thấy sản phẩm");
        }
    }

    private static void showSortProduct(ProductManagement productManagement) {
        System.out.println("Sắp xếp sản phẩm theo giá tăng dần");
        productManagement.sortByUnitPrice();
    }

    private static void showUpdateProduct(ProductManagement productManagement) {
        System.out.println("Chỉnh sửa thông tin sản phẩm");
        System.out.println("Nhập mã sản phẩm cần chỉnh sửa");
        String updateId = sc.nextLine();
        int index = productManagement.findProductById(updateId);
        if (index != -1) {
            Product product = inputProductInfo();
            productManagement.updateById(updateId, product);
        } else {
            System.out.println("Cập nhập bị lỗi do không tìm thấy sản phẩm");
        }
    }

    private static void showCreatProduct(ProductManagement productManagement) {
        System.out.println("Thêm sản phẩm");
        Product product = inputProductInfo();
        productManagement.addNew(product);
    }

    private static Product inputProductInfo() {
        System.out.println("Nhập mã của sản phẩm:");
        String id = sc.nextLine();
        System.out.println("Nhập tên của sản phẩm:");
        String name = sc.nextLine();
        System.out.println("Nhập tên danh mục của sản phẩm");
        String categoryName = sc.nextLine();
        System.out.println("Nhập đơn giá sản phẩm:");
        double unitprice = sc.nextDouble();
        System.out.println("Nhập số lượng sản phẩm:");
        int quantily = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập mô tả sản phẩm:");
        String description = sc.nextLine();
        return new Product(id, name, categoryName, unitprice, quantily, description);
    }

    private static void showAllProduct(ProductManagement productManagement) {
        System.out.println("*****Hiển thị danh sách sản phẩm*****");
        int size = productManagement.size();
        if (size == 0) {
            System.out.println("Danh sách rỗng");
        } else {
            productManagement.displayAll();
        }
    }

    private static void showDeleteProduct(ProductManagement productManagement) {
        System.out.println("Xóa sản phẩm theo mã");
        String deleteId;
        System.out.println("Nhập vào mã của sản phẩm cần xóa:");
        deleteId = sc.nextLine();
        int choice1;
        System.out.println("1. Xác nhận xoá");
        System.out.println("0. Không xoá");
        System.out.print("Nhập vào lựa chọn của bạn: ");
        choice1 = Integer.parseInt(sc.nextLine());
        if (choice1 == 1) {
            boolean isDeleted = productManagement.deleteById(deleteId);
            if (isDeleted) {
                System.out.println("Xóa thành công");
            } else {
                System.out.println("Lỗi do mã sản phẩm không tồn tại");
            }
        }
    }
}
