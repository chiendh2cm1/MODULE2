package com.codegym;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductManager {
    List<Product> productList = new ArrayList<>(10);

    public ProductManager() {
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void updateProduct(int index, Product product) {
        productList.set(index, product);
    }

    public void removeProduct(int index) {
        productList.remove(index);
    }

    public void ShowProductList() {
        for (Product product : productList)
            System.out.println(product);
    }

    public void searchProduct(String name) {
        int count = 0;
        for (Product product : productList) {
            if (product.getName().equalsIgnoreCase(name)) {
                System.out.println(product);
                count++;
            }
        }
        if (count == 0)
            System.out.println("Không có sản phẩm bạn cần tìm trong mảng");
    }

    public void sortProductAscending() {
        productList.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o1.getPrice(), o2.getPrice()); // sắp xêp giảm dần thì đổi o1, o2 hoặc sort thành reverse
            }
        });
        ShowProductList();
    }


    public int searchProductID(String ID) {
        int index = -1;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getID().equalsIgnoreCase(ID)) {
                return i;
            }
        }
        return index;
    }
}
