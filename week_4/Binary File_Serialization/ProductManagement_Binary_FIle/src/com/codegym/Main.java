package com.codegym;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("1", "a", "a", 10, "a"));
        products.add(new Product("2", "b", "a", 20, "a"));
        products.add(new Product("3", "c", "a", 30, "a"));
        products.add(new Product("4", "d", "a", 40, "a"));
        writeFile(products);
        List<Product> products1 = readFile();
        for (Product product : products1) {
            System.out.println(product);
        }

    }

    private static List<Product> readFile() {
        List<Product> products1 = new ArrayList<>();
        try {
            InputStream is = new FileInputStream("product.txt");
            ObjectInputStream ois = new ObjectInputStream(is);
            products1 = (List<Product>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return products1;
    }

    private static void writeFile(List<Product> products) {
        try {
            OutputStream os = new FileOutputStream("product.txt");
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(products);
            os.close();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
