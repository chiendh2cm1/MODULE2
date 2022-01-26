package com.codegym;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Studentmanagement {
    List<Student> studentList = new ArrayList<>(10);


    public Studentmanagement() {
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudent(int index, Student student) {
        studentList.add(index, student);
    }

    public void showStudentList() {
        for (Student student : studentList)
            System.out.println(student);
    }

    public int size() {
        return this.studentList.size();
    }

    public void update(int index, Student student) {
        studentList.set(index, student);
    }

    public void removeStudent(int index) {
        studentList.remove(index);
    }


    public void sortStuden(Scanner sc) {
        int choice;
        int size = studentList.size();
        System.out.println("Bạn lựa chọn cách sắp xếp:(1.bubbleSort, 2.selectionSort, 3.insertSort, 0.exit)");
        choice = sc.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("---bubbleSort---");
                for (int i = 0; i < size; i++) {
                    for (int j = size - 1; j > i; j--) {
                        if (studentList.get(j).getPoin() > studentList.get(j - 1).getPoin()) {
                            Student temp = studentList.get(j);
                            studentList.set(j, studentList.get(j - 1));
                            studentList.set(i, temp);
                        }
                    }
                }
                break;
            }
            case 2: {
                System.out.println("---selectionSort---");
                int min;
                for (int i = 0; i < size - 1; i++) {
                    min = i;
                    for (int j = i + 1; j < size; j++) {
                        if (studentList.get(j).getPoin() > studentList.get(min).getPoin()) {
                            min = j;
                        }
                        if (min != i) {
                            Student temp = studentList.get(min);
                            studentList.set(min, studentList.get(i));
                            studentList.set(i, temp);
                        }
                    }
                }
                break;
            }

            case 3: {
                System.out.println("---insertSort---");
                int pos;
                Student x;
                for (int i = 1; i < size; i++) {
                    x = studentList.get(i);
                    pos = i;
                    while (pos > 0 && x.getPoin() < studentList.get(pos - 1).getPoin()) {
                        studentList.set(pos, studentList.get(pos - 1));
                        pos--;
                    }
                    studentList.set(pos, x);
                }
                break;
            }
            case 0: {
                break;
            }
        }
    }

    public void sortStudentbyStudentCode() {
        int size = studentList.size();
        for (int i = 0; i < size; i++) {
            for (int j = size - 1; j > i; j--) {
                if (studentList.get(j).getStudentCode().compareTo(studentList.get(j - 1).getStudentCode()) > 0) {
                    Student temp = studentList.get(j);
                    studentList.set(j, studentList.get(j - 1));
                    studentList.set(i, temp);
                }
            }
        }
    }

    public void search(String studentCode, Scanner sc) {
        System.out.println("Bạn lựa chọn cách tìm kiếm: (1.Tuyến tính, 2.Nhị phân, 0.Thoát )");
        int choice;
        choice = sc.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("---Tìm kiếm tuyến tính---");
                int index = -1;
                for (int i = 0; i < size(); i++) {
                    if (studentCode.equalsIgnoreCase(studentList.get(i).getStudentCode())) {
                        index = i;
                        System.out.println("Thông tin sinh viên bạn cần tìm là: " + studentList.get(index));
                        break;
                    }
                }
                if (index == -1) {
                    System.out.println("Không tìm thấy sinh viên");
                }
                break;
            }
            case 2: {
                System.out.println("---Tìm kiếm nhị phân---");
                sortStudentbyStudentCode();
                int low = 0;
                int hight = studentList.size() - 1;
                while (hight >= low) {
                    int mid = (hight + low) / 2;
                    if (studentCode.compareTo(studentList.get(mid).getStudentCode()) < 0) {
                        hight = mid - 1;
                    } else if (studentCode.compareTo(studentList.get(mid).getStudentCode()) == 0) {
                        System.out.println("Thông tin sinh viên bạn cần tìm là: " + studentList.get(mid));
                    } else {
                        low = mid - 1;
                    }
                }
                System.out.println("Không tím thấy sinh viên");
                break;
            }
        }

    }
}
