package com.codegym.model;

import java.io.Serializable;

public class OrderDetail implements Serializable {
    private String orderDetailName;
    private int quantity;
    private double price;

    public OrderDetail(){
    }

    public OrderDetail(String orderDetailName, int quantity, double price) {
        this.orderDetailName = orderDetailName;

        this.quantity = quantity;
        this.price = price;
    }

    public String getOrderDetailName() {
        return orderDetailName;
    }

    public void setOrderDetailName(String orderDetailName) {
        this.orderDetailName = orderDetailName;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tên sản phẩm: " + orderDetailName +"\t\t" + "Số lượng: " + quantity + "\t\t" + "Giá: " + price+"\n";
//        return "OrderDetail{" +
//                "orderDetailId='" + orderDetailName + '\'' +
//                ", quantity=" + quantity +
//                ", price=" + price +
//                '}';
    }
}
