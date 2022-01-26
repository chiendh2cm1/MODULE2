package com.codegym;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom {
    private String classId;
    private String className;
    private List<Student> students =new ArrayList<>(10);

    public ClassRoom() {
    }

    public ClassRoom(String classId, String className, List<Student> students) {
        this.classId = classId;
        this.className = className;
        this.students = students;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    
}

