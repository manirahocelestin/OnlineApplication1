package com.example.usersecurity.service;

import com.example.usersecurity.model.Category_activity;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    Category_activity saveCategory(Category_activity category_activity);
    Category_activity updateCategory(Long id, Category_activity category_activity);
    List<Category_activity> findAll();
    Optional<Category_activity> getCategoryName(String name);
    void deleteCategory(Long id);
}
