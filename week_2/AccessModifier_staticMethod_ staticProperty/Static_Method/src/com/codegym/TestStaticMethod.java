package com.codegym;

public class TestStaticMethod {

    public static void main(String[] args) {
	Student.change();
    Student student1 = new Student(1, "a");
    Student student2 = new Student(2,"b");
    Student student3 = new Student(3,"c");
    student1.display();
    student2.display();
    student3.display();
    }
}
