package com.codegym;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {

    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = null;
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.println("Tổng: " + sum);

        } catch (Exception e) {
            System.out.println("Nội dung không tồn tại hoặc ffile lỗi!!!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);
    }
}
