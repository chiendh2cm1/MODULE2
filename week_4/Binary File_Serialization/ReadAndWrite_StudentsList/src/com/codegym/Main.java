package com.codegym;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void writeToFile(String path, List<Student> students){
        try {
            OutputStream os = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(students);
            os.close();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readDataFromtFile(String path){
    List<Student> students = new ArrayList<>();
        try {
            InputStream is = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(is);
            students = (List<Student>) ois.readObject();
            is.close();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }


    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("1", "Chien", "TB"));
        students.add(new Student("2", "Manh", "TB"));
        students.add(new Student("3", "Hao", "TB"));
        students.add(new Student("4", "Nam", "TB"));
        students.add(new Student("5", "Hung", "TB"));

        writeToFile("students.txt",students);

        List<Student> studentsDataFromFile = readDataFromtFile("students.txt");
        for (Student student: studentsDataFromFile)
            System.out.println(student);
    }
}
