package com.codegym.controller;

import com.codegym.IOFile.ReadFile;
import com.codegym.IOFile.WriteFile;

import com.codegym.model.Staff;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StaffManagement implements WriteFile, ReadFile {
    private static List<Staff> staffs = new ArrayList<>();
    private static final String PATH_STAFF = "staff.txt";

    public StaffManagement() {
        File file = new File(PATH_STAFF);
        if (file.exists()) {
            try {
                readFile(PATH_STAFF);
            } catch (IOException | ClassNotFoundException e) {
            }
        }
    }

    public int size() {
        return staffs.size();
    }

    public void displayAll() {
        for (int i = 0; i < staffs.size(); i++) {
            System.out.println("Thông tin nhân viên thứ: " + (i + 1));
            System.out.println("Id:                      " + staffs.get(i).getStaffId());
            System.out.println("Họ và tên:               " + staffs.get(i).getFullName());
            System.out.println("Tuổi:                    " + staffs.get(i).getAge());
            System.out.println("Số điện thoại:           " + staffs.get(i).getPhoneNumber());
            System.out.println("Tiền công theo giờ:      " + staffs.get(i).getWage() + " VNĐ");
            System.out.println();
        }
    }

    public int findStaffByname(String name) {
        int index = -1;
        for (int i = 0; i < staffs.size(); i++) {
            if (staffs.get(i).getFullName().equals(name)) {
                index = i;
                break;
            }
        }
        return index;
    }


    public void addNew(Staff staff) {
        staffs.add(staff);
        try {
            writeFile(PATH_STAFF);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void updateById(String name, Staff staff) {
        int index = findStaffByname(name);
        staffs.set(index, staff);
        try {
            writeFile(PATH_STAFF);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean deleteById(String name) {
        int index = findStaffByname(name);
        if (index != -1) {
            staffs.remove(index);
            try {
                writeFile(PATH_STAFF);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return true;
        }
        return false;
    }

    public Staff getByName(String name) {
        int index = findStaffByname(name);
        return staffs.get(index);
    }

    @Override
    public void readFile(String path) throws IOException, ClassNotFoundException {
        InputStream is = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(is);
        staffs = (List<Staff>) ois.readObject();
        is.close();
        ois.close();
    }

    @Override
    public void writeFile(String path) throws IOException {
        OutputStream os = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(staffs);
        os.close();
        oos.close();
    }
}
