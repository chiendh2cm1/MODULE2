package com.codegym.view;

import com.codegym.controller.OrderManagement;
import com.codegym.model.Order;
import com.codegym.model.OrderDetail;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderMenu {
    public static final String PATH_ORDER_TXT = "orderText.txt";
    private final OrderManagement orderManagement = new OrderManagement();
    public Scanner sc = new Scanner(System.in);
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_RESET = "\u001B[0m";
    public void run() {
        int choice;
        boolean flag = true;
        while (flag) {
            try {
                do {
                    orderMenu();
                    choice = Integer.parseInt(sc.nextLine());
                    switch (choice) {
                        case 1:
                            showAllOrder();
                            break;
                        case 2:
                            showCreatOrder();
                            break;
                        case 3:
                            showUpdateOrder();
                            break;
                        case 4:
                            showDeleteOrder();
                            break;
                        case 5:
                            showRevenueOrder();
                            break;
                        case 6:
                            showFindOrder();
                            break;
                        case 7:
                            showTotalOrderRevenue();
                            break;
                        case 8:
                            showInvoice();
                            break;
                        case 0:
                            flag = false;
                            break;
                        default:
                            System.out.println(TEXT_RED+"\n\t\t\t\t\t\t\t>>>>>>>>>>>>>>>>>>>>>>>>>> Nhập trong khoảng từ 0 đến 7 <<<<<<<<<<<<<<<<<<<<<<<<<<<"+TEXT_RESET);
                            break;
                    }
                } while (choice != 0);
            } catch (Exception e) {
                System.out.println(TEXT_RED+"\n\t\t\t\t\t\t\t>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Xin vui lòng nhập số <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<"+TEXT_RESET);
            }
        }
    }

    private void showInvoice() throws IOException {
        System.out.println("Xuất hóa đơn ra file text");
        System.out.println("Nhập mã đơn hàng cần xuất: ");
        String id = sc.nextLine();
        int index = orderManagement.findOrderById(id);
        if (index !=-1){
            Order order;
            order = orderManagement.getById(id);
            orderManagement.writeFileText(order, PATH_ORDER_TXT);
            System.out.println("Xuất hóa đơn thành công!!!");
        }else {
            System.out.println(TEXT_RED+"Xuất hóa đơn thất bại do không tim được mã đơn hàng"+TEXT_RESET);
        }
    }

    private void orderMenu() {
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t##============================== QUẢN LÝ ĐƠN HÀNG ==============================##");
        System.out.println("\t\t\t\t\t\t\t|| 1. Hiển thị danh sách các đơn hàng   || 6. Tìm kiếm đơn hàng                ||");
        System.out.println("\t\t\t\t\t\t\t|| 2. Thêm đơn hàng mới                 || 7. Tính tổng tiền tất cả đơn hàng   ||");
        System.out.println("\t\t\t\t\t\t\t|| 3. Sửa đổi thông tin đơn hàng        || 8. Xuất hóa đơn                     ||");
        System.out.println("\t\t\t\t\t\t\t|| 4. Xóa đơn hàng                      ||                                     ||");
        System.out.println("\t\t\t\t\t\t\t|| 5. Tính tiền 1 đơn hàng              || 0. Quay lại                         ||");
        System.out.println("\t\t\t\t\t\t\t##====================================(^^^^)====================================##");
        System.out.print("\t\t\t\t\t\t\tNhập vào lựa chọn của bạn: ");
    }

    private void showAllOrder() {
        System.out.println("*****Hiển thị danh sách các đơn hàng*****");
        int size = orderManagement.size();
        if (size == 0) {
            System.err.println("Danh sách rỗng");
        } else {
            orderManagement.displayAll();
        }
    }

    private void showDeleteOrder() {
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
                System.out.println(TEXT_RED+"Lỗi do mã đơn hàng không tồn tại"+TEXT_RESET);
            }
        }
    }

    private void showUpdateOrder() {
        System.out.println("Chỉnh sửa thông tin đơn hàng");
        System.out.println("Nhập mã đơn hàng cần chỉnh sửa");
        String updateId = sc.nextLine();
        int index = orderManagement.findOrderById(updateId);
        if (index != -1) {
            Order order = inputOrderInfo();
            orderManagement.updateById(updateId, order);
        } else {
            System.out.println(TEXT_RED+"Cập nhập bị lỗi do không tìm thấy đơn hàng"+TEXT_RESET);
        }
    }

    private void showCreatOrder() {
        System.out.println("*****Thêm đơn hàng*****");
        Order order = inputOrderInfo();
        orderManagement.addNew(order);
    }

    private Order inputOrderInfo() {
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
            System.out.println("Nhập đơn giá: ");
            double price = sc.nextDouble();
            sc.nextLine();
            OrderDetail orderDetail = new OrderDetail(orderDetailname, quantity, price);
            orderDetails.add(orderDetail);
        }
        Order order = new Order(oderId, customerName, customerPhone, orderDetails);
        return order;
    }

    private void showTotalOrderRevenue() {
        System.out.println("Tổng tiền tất cả đơn hàng: ");
        orderManagement.totalOrderRevenue();
    }

    private void showRevenueOrder() {
        double revenueOrder = 0;
        System.out.println("Tính tiền cho 1 đơn hàng");
        System.out.println("Nhập mã đơn hàng cần tính tiền: ");
        String orderId = sc.nextLine();
        int index = orderManagement.findOrderById(orderId);
        if (index != -1) {
            revenueOrder = orderManagement.orderRevenue(orderId);
        } else {
            System.out.println(TEXT_RED+"Không tìm thấy đơn hàng"+TEXT_RESET);
        }
        System.out.println("Tiền của đơn hàng là: " + revenueOrder + " VNĐ");
        return;
    }

    private void showFindOrder() {
        System.out.println("Tìm kiếm đơn hàng theo mã đơn hàng");
        System.out.println("Nhập mã đơn hàng: ");
        String orderId = sc.nextLine();
        int index = orderManagement.findOrderById(orderId);
        if (index != -1) {
            System.out.println("Thông tin đơn hàng cần tìm là:");
            Order order = orderManagement.getById(orderId);
            System.out.println("Mã đơn hàng( " + order.getOrderId() + " ), " + "Tên khách hàng( " + order.getCustomerName() + " ), " + "SĐT( " + order.getCustomerPhone() + " )");
            for (OrderDetail orderDetail : order.getOrderDetails()) {
                System.out.printf("%-25s%-25s%-25s\n", "Tên mặt hàng", "Số lượng", "Đơn giá");
                System.out.printf("%-25s%-25s%-25s\n", orderDetail.getOrderDetailName(), orderDetail.getQuantity(), orderDetail.getPrice());
            }
        } else {
            System.out.println(TEXT_RED+"Không tìm thấy đơn hàng"+TEXT_RESET);
        }
    }
}

