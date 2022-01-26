package com.codegym;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("chien", 26, "TB");
        Student student2 = new Student("hoa", 29, "HN");
        Student student3 = new Student("thang", 28, "HN");

        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);
        System.out.println(studentMap);
        for (Map.Entry<Integer, Student> studentEntry : studentMap.entrySet()){
            System.out.println(studentEntry);
        }

        Set<Student> studentSet = new HashSet<>();
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student1);
        System.out.println(studentSet);
        for (Student student: studentSet){
            System.out.println(student);
        }
    }
}
