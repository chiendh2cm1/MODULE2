package com.codegym.view;

import com.codegym.controller.OrderDetails;
import com.codegym.controller.OrderManagement;
import com.codegym.controller.ProductManagement;
import com.codegym.model.Order;
import com.codegym.model.Product;

import java.util.Scanner;

public class Main2 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        OrderManagement orderManagement = new OrderManagement();
        int choice;
        boolean flag = true;
        while (flag) {
            try {
                do {
                    System.out.println();
                    System.out.println("\t\t\t\t\t\t\t##============================== QUẢN LÝ SẢN PHẨM ==============================##");
                    System.out.println("\t\t\t\t\t\t\t|| 1. Hiển thị danh sách sách hóa đơn    || 4. Xóa hóa đơn                      ||");
                    System.out.println("\t\t\t\t\t\t\t|| 2. Thêm hóa đơn                       ||                                     ||");
                    System.out.println("\t\t\t\t\t\t\t|| 3. Sửa đổi thông hóa đơn              || 7. Quay lại                         ||");
                    System.out.println("\t\t\t\t\t\t\t##====================================(^^^^)====================================##");
                    System.out.print("\t\t\t\t\t\t\tNhập vào lựa chọn của bạn: ");
                    choice = Integer.parseInt(sc.nextLine());
                    switch (choice) {
                        case 1:

                            break;
                        case 2:
                            Order order = new Order();
                            System.out.println("Thêm hóa đơn bán hàng");
                            System.out.println("Mã đơn hàng:");
                            String oderId = sc.nextLine();
                            System.out.println("Tên khách hàng:");
                            String customerName = sc.nextLine();
                            System.out.println("Số điện thoại khách hàng");
                            String customerPhone = sc.nextLine();
                            System.out.println("Nhập số lượng các loại sản phẩm cần mua: ");
                            int numProduct = sc.nextInt();
                            for (int i = 0; i <= numProduct; i++) {
                                System.out.println("Sản phẩm thứ " + i + " : ");
                                System.out.println("Nhập mã sản phẩm:");
                                String productId = sc.nextLine();
                                sc.nextLine();
                                System.out.println("Nhập tên sản phẩm:");
                                String productName = sc.nextLine();
                                System.out.println("Nhập số lượng sản phẩm:");
                                int quantyli = sc.nextInt();
                                System.out.println("Nhập giá trị của sản phẩm:");
                                double price = sc.nextDouble();
                                OrderDetails orderDetails = new OrderDetails(productId, productName, quantyli, price);
                                order.getOrderDetailsList().add(orderDetails);
                            }
                            order.setOderId(oderId);
                            order.setCustomerName(customerName);
                            order.setCustomerPhone(customerPhone);
                            orderManagement.addNew(order);
                            break;
                        default:
                            System.out.println("Nhập trong khảng từ 0 đến 2");
                            break;
                        case 0:
                            flag = false;
                            break;
                    }
                } while (choice != 0);
            } catch (Exception e) {
                System.out.println("Xin vui lòng nhập số");
            }
        }
    }
}
