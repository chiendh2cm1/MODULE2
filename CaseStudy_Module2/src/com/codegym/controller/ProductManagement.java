package com.codegym.controller;

import com.codegym.IOFile.ReadFile;
import com.codegym.IOFile.WriteFile;
import com.codegym.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManagement implements GeneralManagement<Product>, WriteFile, ReadFile {
    private static List<Product> products = new ArrayList<>();
    private static final String PATH_PRODUCT = "product.txt";

    public ProductManagement() {
        File file = new File(PATH_PRODUCT);
        if (file.exists()) {
            try {
                readFile(PATH_PRODUCT);
            } catch (IOException | ClassNotFoundException e) {
            }
        }
    }

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

    public void showProductByCategory(String categoryName) {
        for (Product product : products) {
            if (product.getCategoryName().equals(categoryName)) {
                System.out.println(product);
            }
        }
    }

    @Override
    public void displayAll() {
        System.out.printf("%-15s%-25s%-25s%-25s%-25s%-25s\n", "Mã sản phẩm", "Tên sản phẩm", "Tên danh mục", "Đơn giá", "Số lượng", "Mô tả");
        for (Product product : products)
            System.out.printf("%-15s%-25s%-25s%-25f%-25d%-25s\n", product.getProductId(), product.getProductName(), product.getCategoryName(), product.getUnitPrice(), product.getQuantily(), product.getDescription());
    }

    @Override
    public void addNew(Product product) {
        products.add(product);
        try {
            writeFile(PATH_PRODUCT);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateById(String id, Product product) {
        int index = findProductById(id);
        products.set(index, product);
        try {
            writeFile(PATH_PRODUCT);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public boolean deleteById(String id) {
        int index = findProductById(id);
        if (index != -1) {
            products.remove(index);
            try {
                writeFile(PATH_PRODUCT);
            } catch (IOException e) {
                e.printStackTrace();
            }
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
        products = (List<Product>) ois.readObject();
    }

    @Override
    public void writeFile(String path) throws IOException {
        OutputStream os = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(products);
    }
}
