package com.codegym.view;

import com.codegym.controller.OrderManagement;
import com.codegym.model.Order;
import com.codegym.model.OrderDetail;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderMenu {
    private OrderManagement orderManagement = new OrderManagement();
    public static Scanner sc = new Scanner(System.in);

    public void run() {
        int choice;
        boolean flag = true;
        while (flag) {
            try {
                do {
                    System.out.println();
                    System.out.println("\t\t\t\t\t\t\t##============================== QUẢN LÝ ĐƠN HÀNG ==============================##");
                    System.out.println("\t\t\t\t\t\t\t|| 1. Hiển thị danh sách các đơn hàng    || 5. Tính tiền 1 đơn hàng             ||");
                    System.out.println("\t\t\t\t\t\t\t|| 2. Thêm đơn hàng mới                  || 6. Tìm kiếm đơn hàng                ||");
                    System.out.println("\t\t\t\t\t\t\t|| 3. Sửa đổi thông tin đơn hàng         || 7. Tính tổng tiền tất cả đơn hàng   ||");
                    System.out.println("\t\t\t\t\t\t\t|| 4. Xóa đơn hàng                       || 0. Quay lại                         ||");
                    System.out.println("\t\t\t\t\t\t\t##====================================(^^^^)====================================##");
                    System.out.print("\t\t\t\t\t\t\tNhập vào lựa chọn của bạn: ");
                    choice = Integer.parseInt(sc.nextLine());
                    switch (choice) {
                        case 1:
                            showAllOrder(orderManagement);
                            break;
                        case 2:
                            showCreatOrder(orderManagement);
                            break;
                        case 3:
                            showUpdateOrder(orderManagement);
                            break;
                        case 4:
                            showDeleteOrder(orderManagement);
                            break;
                        case 5:
                            showRevenueOrder(orderManagement);
                            break;
                        case 6:
                            showFindOrder(orderManagement);
                            break;
                        case 7:
                            showTotalOrderRevenue(orderManagement);
                            break;
                        case 0:
                            flag = false;
                            break;
                        default:
                            System.err.println("\n\t\t\t\t\t\t\t>>>>>>>>>>>>>>>>>>>>>>>>>> Nhập trong khoảng từ 0 đến 6 <<<<<<<<<<<<<<<<<<<<<<<<<<<");
                            break;
                    }
                } while (choice != 0);
            } catch (Exception e) {
                System.err.println("\n\t\t\t\t\t\t\t>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Xin vui lòng nhập số <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
            }
        }
    }

    private static void showAllOrder(OrderManagement orderManagement) {
        System.out.println("*****Hiển thị danh sách các đơn hàng*****");
        int size = orderManagement.size();
        if (size == 0) {
            System.out.println("Danh sách rỗng");
        } else {
            orderManagement.displayAll();
        }
    }

    private static void showDeleteOrder(OrderManagement orderManagement) {
        System.out.println("Xóa đơn hàng theo mã");
        String deleteId;
        System.out.println("Nhập vào mã của đơn hàng cần xóa:");
        deleteId = sc.nextLine();
        int choice1;
        System.out.println("1. Xác nhận xoá");
        System.out.println("0. Không xoá");
        System.out.print("Nhập vào lựa chọn của bạn: ");
        choice1 = Integer.parseInt(sc.nextLine());
        if (choice1 == 1) {
            boolean isDeleted = orderManagement.deleteById(deleteId);
            if (isDeleted) {
                System.out.println("Xóa thành công");
            } else {
                System.out.println("Lỗi do mã đơn hàng không tồn tại");
            }
        }
    }

    private static void showUpdateOrder(OrderManagement orderManagement) {
        System.out.println("Chỉnh sửa thông tin đơn hàng");
        System.out.println("Nhập mã đơn hàng cần chỉnh sửa");
        String updateId = sc.nextLine();
        int index = orderManagement.findOrderById(updateId);
        if (index != -1) {
            Order order = inputOrderInfo();
            orderManagement.updateById(updateId, order);
        } else {
            System.out.println("Cập nhập bị lỗi do không tìm thấy đơn hàng");
        }
    }

    private static void showCreatOrder(OrderManagement orderManagement) {
        System.out.println("*****Thêm đơn hàng*****");
        Order order = inputOrderInfo();
        orderManagement.addNew(order);
    }

    private static Order inputOrderInfo() {
        System.out.println("Mã đặt hàng: ");
        String oderId = sc.nextLine();
        System.out.println("Nhập tên khách hàng: ");
        String customerName = sc.nextLine();
        System.out.println("Nhập số điện thoại: ");
        String customerPhone = sc.nextLine();
        System.out.println("Nhập số lượng mặt hàng: ");
        int orderDetailNum = sc.nextInt();
        sc.nextLine();
        List<OrderDetail> orderDetails = new ArrayList<>();
        for (int i = 0; i < orderDetailNum; i++) {
            System.out.println("Nhập mặt hàng thứ " + (i + 1) + " :");
            System.out.println("Nhập tên mặt hàng: ");
            String orderDetailname = sc.nextLine();
            System.out.println("Nhập số lượng: ");
            int quantity = sc.nextInt();
            System.out.println("Nhập giá: ");
            double price = sc.nextDouble();
            sc.nextLine();
            OrderDetail orderDetail = new OrderDetail(orderDetailname, quantity, price);
            orderDetails.add(orderDetail);
        }
        Order order = new Order(oderId, customerName, customerPhone, orderDetails);
        return order;
    }

    private static void showTotalOrderRevenue(OrderManagement orderManagement) {
        System.out.println("Tổng tiền tất cả đơn hàng: ");
        orderManagement.totalOrderRevenue();
    }

    private static void showRevenueOrder(OrderManagement orderManagement) {
        double revenueOrder = 0;
        System.out.println("Tính tiền cho 1 đơn hàng");
        System.out.println("Nhập mã đơn hàng cần tính tiền: ");
        String orderId = sc.nextLine();
        int index = orderManagement.findOrderById(orderId);
        if (index != -1) {
            revenueOrder = orderManagement.orderRevenue(orderId);
        } else {
            System.out.println("Không tìm thấy đơn hàng");
        }
        System.out.println("Tiền của đơn hàng là: " + revenueOrder + " VNĐ");
        return;
    }

    private static void showFindOrder(OrderManagement orderManagement) {
        System.out.println("Tìm kiếm đơn hàng theo mã đơn hàng");
        System.out.println("Nhập mã đơn hàng: ");
        String orderId = sc.nextLine();
        int index = orderManagement.findOrderById(orderId);
        if (index != -1) {
            System.out.println(" Thông tin đơn hàng cần tìm là:");
            System.out.println(orderManagement.getById(orderId));
        } else {
            System.out.println("Không tìm thấy đơn hàng");
        }
    }
}

