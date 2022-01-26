package com.codegym.controller;

public interface GeneralManagement<T> {//Sử dụng Generic

    void displayAll();

    void addNew(T t);

    void updateById(String id, T t);

    boolean deleteById(String id);

    T getById(String id);
}