package com.codegym.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Order implements Serializable {
    private String OrderId;
    private String customerName;
    private String customerPhone;
    private List<OrderDetail> orderDetails = new ArrayList<OrderDetail>();

    public Order() {
    }

    public Order(String orderId, String customerName, String customerPhone) {
        OrderId = orderId;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
    }

    public Order(String orderId, String customerName, String customerPhone, List<OrderDetail> orderDetails) {
        OrderId = orderId;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.orderDetails = orderDetails;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public String getOrderId() {
        return OrderId;
    }

    public void setOrderId(String orderId) {
        OrderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    @Override
    public String toString() {
        return "Order{" +
                "OrderId='" + OrderId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                '}';
    }
}
