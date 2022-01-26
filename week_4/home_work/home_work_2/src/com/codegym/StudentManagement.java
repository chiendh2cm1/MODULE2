package com.codegym;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
    private List<Student> students = new ArrayList<>();

    public StudentManagement() {
    }

    public StudentManagement(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void showStudents() {
        for (Student student : students)
            System.out.println(student);
    }

    public int size() {
        return this.students.size();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public int findStudentById(String id) {
        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equalsIgnoreCase(id)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void updateStudent(String id, Student student) {
        int index = findStudentById(id);
        this.students.set(index, student);
    }

    public boolean removeStudent(String id) {
        int index = findStudentById(id);
        if (index != -1) {
            this.students.remove(index);
            return true;
        }
        return false;
    }

    public void bubbleSort(double mark) {
        for (int i = 0; i < size(); i++) {
            for (int j = size() - 1; j > i; j--) {
                if (students.get(j).getMark() < students.get(j - 1).getMark()) {
                    Student temp = students.get(j);
                    students.set(j, students.get(j - 1));
                    students.set(j - 1, temp);
                    System.out.println("Danh sách đã được sắp xếp");
                }
            }
        }
    }

    public void selectionSort() {
        int min;
        for (int i = 0; i < size() - 1; i++) {
            min = i;
            for (int j = i + 1; j < size(); j++) {
                if (students.get(j).getMark() < students.get(min).getMark()) {
                    min = j;
                }
            }
            if (min != i) {
                Student temp = students.get(min);
                students.set(min, students.get(i));
                students.set(i, temp);
            }
        }
    }

    public void insertionSort() {
        int pos;
        Student x;
        for (int i = 1; i < size(); i++) {
            pos = i;
            x = students.get(i);
            while (pos > 0 && x.getMark() > students.get(pos - 1).getMark()) {
                students.set(pos, students.get(pos - 1));
                pos--;
            }
            students.set(pos, x);
        }
    }

    public void bubbleSortById() {
        for (int i = 0; i < size(); i++) {
            for (int j = size() - 1; j > i; j--) {
                if (students.get(j).getId().compareTo(students.get(j - 1).getId()) > 0) {
                    Student temp = students.get(j);
                    students.set(j, students.get(j - 1));
                    students.set(j - 1, temp);
                }
            }
        }
    }

    public int findStudentUsingBinarySearch(String id) {
        bubbleSortById();
        int low = 0;
        int high = students.size() - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (students.get(middle).getId().equals(id)) {
                return middle;//
            } else if (students.get(middle).getId().compareTo(id) > 0) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }
}
