package com.codegym.model;

import com.codegym.controller.OrderDetails;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String oderId;
    private String customerName;
    private String customerPhone;
    private List<OrderDetails> orderDetailsList;

    public Order() {
        orderDetailsList = new ArrayList<OrderDetails>();
    }

    public Order(String oderId, String customerName, String customerPhone, List<OrderDetails> orderDetailsList) {
        this.oderId = oderId;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.orderDetailsList = orderDetailsList;
    }

    public String getOderId() {
        return oderId;
    }

    public void setOderId(String oderId) {
        this.oderId = oderId;
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

    public List<OrderDetails> getOrderDetailsList() {
        return orderDetailsList;
    }

    public void setOrderDetailsList(List<OrderDetails> orderDetailsList) {
        this.orderDetailsList = orderDetailsList;
    }
}
