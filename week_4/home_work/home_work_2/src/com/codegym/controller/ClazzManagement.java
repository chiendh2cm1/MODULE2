package com.codegym.controller;

import com.codegym.model.Clazz;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ClazzManagement implements GeneralManagement<Clazz>, ReadFile, WriteFile {
    private List<Clazz> clazzes = new ArrayList<>();

    @Override
    public void displayAll() {
        for (Clazz clazz : clazzes) {
            System.out.println(clazz);
        }
    }

    @Override
    public void addNew(Clazz clazz) {
        clazzes.add(clazz);
    }

    public int findClazzById(String id) {
        int index = -1;
        for (int i = 0; i < clazzes.size(); i++) {
            if (clazzes.get(i).getId().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public void updateById(String id, Clazz clazz) {
        int index = findClazzById(id);
        clazzes.set(index, clazz);
    }

    @Override
    public boolean deleteById(String id) {
        int index = findClazzById(id);
        if (index != -1) {
            clazzes.remove(index);
            return true;
        }
        return false;
    }

    @Override
    public Clazz getById(String id) {
        int index = findClazzById(id);
        return clazzes.get(index);
    }

    @Override
    public void readFile(String path) throws IOException, ClassNotFoundException {
        InputStream is = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(is);
        this.clazzes = (List<Clazz>) ois.readObject();
    }

    @Override
    public void writeFile(String path) throws IOException {
        OutputStream os = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(this.clazzes);
    }
}