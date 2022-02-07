package com.codegym.controller;

import com.codegym.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManagement implements GeneralManagement<Product>, ReadFile, WriteFile {
    List<Product> products = new ArrayList<>();

    public int size() {
        return products.size();
    }

    public int findProductById(String id) {
        int index = -1;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProductId().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void sortByUnitPrice() {
        for (int i = 0; i < products.size(); i++) {
            for (int j = products.size() - 1; j > i; j--) {
                if (products.get(j).getUnitPrice() < products.get(j - 1).getUnitPrice()) {
                    Product temp = products.get(j);
                    products.set(j, products.get(j - 1));
                    products.set(j - 1, temp);
                }
            }
        }
    }

    @Override
    public void displayAll() {
        System.out.printf("%-10s%-15s%-15s%-15s%-15s\n", "Mã sản phẩm", "Tên sản phẩm", "Đơn giá", "Số lượng", "Mô tả");
        for (Product product : products)
            System.out.printf("%-10s%-15s%-15f%-15d%-15s\n", product.getProductId(), product.getProductName(), product.getUnitPrice(), product.getQuantily(), product.getDescription());
    }

    @Override
    public void addNew(Product product) {
        this.products.add(product);
    }

    @Override
    public void updateById(String id, Product product) {
        int index = findProductById(id);
        products.set(index, product);
    }


    @Override
    public boolean deleteById(String id) {
        int index = findProductById(id);
        if (index != -1) {
            products.remove(index);
            return true;
        }
        return false;
    }

    @Override
    public Product getById(String id) {
        int index = findProductById(id);
        return products.get(index);
    }

    @Override
    public void readFile(String path) throws IOException, ClassNotFoundException {
        InputStream is = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(is);
        this.products = (List<Product>) ois.readObject();
    }

    @Override
    public void writeFile(String path) throws IOException {
        OutputStream os = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(this.products);
    }
}
