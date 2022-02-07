package com.codegym.controller;

import com.codegym.model.Order;
import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.List;

public class OrderManagement implements GeneralManagement<Order> {
    List<Order> orders = new ArrayList<>();

    public int size() {
        return orders.size();
    }

    public int findOrderByCustomerName(String customerName) {
        int index = -1;
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getCustomerName().equals(customerName)) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public void displayAll() {
        ProductManagement productManagement = new ProductManagement();
        System.out.printf("%-10s%-15s%-15s\n", "Mã đơn hàng", "Tên khách hàng", "Số điện thoại");
        for (Order order : orders) {
            System.out.printf("%-10s%-15s%-15s\n", order.getOderId(), order.getCustomerName(), order.getCustomerPhone());
            System.out.printf("%-10s%-15s%-15s%-15s%-15s\n", "STT", "Mã sản phẩm", "Tên sản phẩm", "Số lượng", "Giá");
            int i = 1;
            for (OrderDetails orderDetails : order.getOrderDetailsList()) {
                Product product = productManagement.getById(orderDetails.getProductId());
                System.out.printf("%-10s%-15s%-15s%-15s%-15s\n", i, product.getProductId(), product.getProductName(), orderDetails.getQuantily(), orderDetails.getPrice());
                i++;
            }
        }
    }

    @Override
    public void addNew(Order order) {
        this.orders.add(order);
    }

    @Override
    public void updateById(String id, Order order) {
        int index = findOrderByCustomerName(id);
        orders.set(index, order);
    }

    @Override
    public boolean deleteById(String id) {
        int index = findOrderByCustomerName(id);
        if (index != -1) {
            orders.remove(index);
            return true;
        }
        return false;
    }

    @Override
    public Order getById(String id) {
        int index = findOrderByCustomerName(id);
        return orders.get(index);
    }
}
