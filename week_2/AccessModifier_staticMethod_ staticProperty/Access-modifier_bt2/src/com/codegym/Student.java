package com.codegym;

public class Student {
    private String name;
    private String classes;
    Student(){
        this.name = "chiến";
        this.classes = "C1121G1";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
// Khi thay đổi  access modifier là private các phương thức thì xuất hiện lỗi.