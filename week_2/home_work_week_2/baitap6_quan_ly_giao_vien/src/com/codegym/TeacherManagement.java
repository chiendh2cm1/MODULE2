package com.codegym;

import java.util.ArrayList;
import java.util.List;

public class TeacherManagement {
    List<TeacherStaff> teacherStaffList = new ArrayList<>(10);

    public TeacherManagement() {
    }

    public TeacherManagement(List<TeacherStaff> teacherStaffList) {
        this.teacherStaffList = teacherStaffList;
    }

    public int size() {
        return this.teacherStaffList.size();
    }

    public void addTeacherStaff(TeacherStaff teacherStaff) {
        teacherStaffList.add(teacherStaff);
    }

    public void removeTeacherStaff(int index) {
        teacherStaffList.remove(index);
    }

    public void updateTeacherStaff(int index, TeacherStaff teacherStaff) {
        teacherStaffList.set(index, teacherStaff);
    }

    public void showLish() {
        for (TeacherStaff teacherStaff : teacherStaffList)
            teacherStaff.display();
    }

    public void showTeacherStaffIsPayMore80() {
        System.out.println("Danh sách các cán bộ giáo viên có lương trên 80 triệu");
        for (TeacherStaff teacherStaff : teacherStaffList) {
            if (teacherStaff.getRealField() > 8000000)
                teacherStaff.display();
        }
    }

}
