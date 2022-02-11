package com.codegym.controller;

import com.codegym.IOFile.ReadFile;
import com.codegym.IOFile.WriteFile;
import com.codegym.model.Order;
import com.codegym.model.OrderDetail;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class OrderManagement implements GeneralManagement<Order>, ReadFile, WriteFile {
    private static List<Order> orders = new ArrayList<>();
    private static final String PATH_ORDER = "oder.txt";

    public OrderManagement() {
        File file = new File(PATH_ORDER);
        if (file.exists()) {
            try {
                readFile(PATH_ORDER);
            } catch (IOException | ClassNotFoundException e) {
            }
        }
    }

    public int size() {
        return orders.size();
    }

    public int findOrderById(String OrderId) {
        int index = -1;
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getOrderId().equals(OrderId)) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public void displayAll() {
        for (Order order : orders) {
            System.out.println("Mã đơn hàng( " + order.getOrderId() + " ), " + "Tên khách hàng( " + order.getCustomerName() + " ), " + "SĐT( " + order.getCustomerPhone() + " )");
            System.out.printf("%-15s%-25s%-25s\n", "Tên mặt hàng", "Số lượng", "Giá");
            for (OrderDetail orderDetail : order.getOrderDetails()) {
                System.out.printf("%-15s%-25s%-25s\n", orderDetail.getOrderDetailName(), orderDetail.getQuantity(), orderDetail.getPrice());
            }
        }
    }

    public double orderRevenueByOrder(Order order) {
        double revenue = 0;
        for (int i = 0; i < order.getOrderDetails().size(); i++) {
            revenue += order.getOrderDetails().get(i).getQuantity() * order.getOrderDetails().get(i).getPrice();
        }
        return revenue;
    }

    public double orderRevenue(String OrderId) {
        double revenue = 0;
        int index = findOrderById(OrderId);
        Order order = null;
        for (int i = 0; i < orders.size(); i++) {
            order = orders.get(index);
        }
        for (int i = 0; i < Objects.requireNonNull(order).getOrderDetails().size(); i++) {
            revenue += order.getOrderDetails().get(i).getQuantity() * order.getOrderDetails().get(i).getPrice();
        }
        return revenue;
    }

    public void totalOrderRevenue() {
        double totalRevenue = 0;
        for (int i = 0; i < orders.size(); i++) {
            for (int j = 0; j < orders.get(i).getOrderDetails().size(); j++) {
                totalRevenue += orders.get(i).getOrderDetails().get(j).getQuantity() * orders.get(i).getOrderDetails().get(j).getPrice();
            }
        }
        System.out.println("Tổng doanh thu: " + totalRevenue + " VNĐ");
    }

    @Override
    public void addNew(Order order) {
        orders.add(order);
        try {
            writeFile(PATH_ORDER);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateById(String id, Order order) {
        int index = findOrderById(id);
        orders.set(index, order);
        try {
            writeFile(PATH_ORDER);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean deleteById(String id) {
        int index = findOrderById(id);
        if (index != -1) {
            orders.remove(index);
            try {
                writeFile(PATH_ORDER);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return true;
        }
        return false;
    }

    @Override
    public Order getById(String id) {
        int index = findOrderById(id);
        return orders.get(index);
    }

    @Override
    public void readFile(String path) throws IOException, ClassNotFoundException {
        InputStream is = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(is);
        orders = (List<Order>) ois.readObject();
    }

    @Override
    public void writeFile(String path) throws IOException {
        OutputStream os = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(orders);
    }

    public void writeFileText(Order order, String path) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("\t\t\t\tSun Flower - Tiệm hoa mặt trời");
        bufferedWriter.write("Mã đơn hàng:             " + order.getOrderId() + "\n");
        bufferedWriter.write("Tên khách hàng:          " + order.getCustomerName() + "\n");
        bufferedWriter.write("Số điện thoại:            " + order.getCustomerPhone() + "\n");
        bufferedWriter.write("Danh sách mua: ( Tên sản phẩm, Số lượng, Giá )" + "\n");
        for (OrderDetail orderDetail : order.getOrderDetails()) {
            bufferedWriter.write(orderDetail.getOrderDetailName() + "\t\t" + orderDetail.getQuantity() + "\t\t" + orderDetail.getPrice() + "\n");
        }
        bufferedWriter.write("Tổng tiền hóa đơn  :" +  (int) orderRevenueByOrder(order) + "VNĐ");
        bufferedWriter.close();
        fileWriter.close();
    }
}
