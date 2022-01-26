package com.codegym;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyFileText {
    public List<String> readFileText(String filePath) {
        List<String> strings = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                strings.add(line);
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return strings;
    }

    public void copyFile(String filePath, List<String> strings) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String string : strings) {
                System.out.println(string);
                bufferedWriter.write(string + "\n");
            }
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
