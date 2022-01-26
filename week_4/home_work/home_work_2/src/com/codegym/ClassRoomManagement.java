package com.codegym;

import java.util.ArrayList;
import java.util.List;

public class ClassRoomManagement {
    private List<StudentManagement> classRooms = new ArrayList<>();

    public ClassRoomManagement() {
    }

    public List<StudentManagement> getClassRooms() {
        return classRooms;
    }

    public void setClassRooms(List<StudentManagement> classRooms) {
        this.classRooms = classRooms;
    }


}
