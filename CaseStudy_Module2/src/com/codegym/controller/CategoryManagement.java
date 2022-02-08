package com.codegym.controller;

import com.codegym.model.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryManagement implements GeneralManagement<Category> {
    List<Category> categories = new ArrayList<>();

    public int size() {
        return categories.size();
    }

    public int findCategoryById(String categoryId) {
        int index = -1;
        for (int i = 0; i < categories.size(); i++) {
            if (categories.get(i).getCategoryId().equals(categoryId)) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public void displayAll() {
        System.out.printf("%-25s%-25s\n", "Mã danh mục", "Tên danh mục");
        for (Category category : categories)
            System.out.printf("%-25s%-25s\n", category.getCategoryId(), category.getCategoryName());
    }

    @Override
    public void addNew(Category category) {
        this.categories.add(category);
    }

    @Override
    public void updateById(String categoryId, Category category) {
        int index = findCategoryById(categoryId);
        categories.set(index, category);
    }

    @Override
    public boolean deleteById(String categoryId) {
        int index = findCategoryById(categoryId);
        if (index != -1) {
            categories.remove(index);
            return true;
        }
        return false;
    }

    public Category getById(String categoryId) {
        int index = findCategoryById(categoryId);
        return categories.get(index);
    }
}
