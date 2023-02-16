package com.example.usersecurity.serviceImpl;

import com.example.usersecurity.model.Activity;
import com.example.usersecurity.model.Category_activity;
import com.example.usersecurity.repository.CategoryRepo;
import com.example.usersecurity.service.CategoryService;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class CategoryImpl implements CategoryService {
    private final CategoryRepo categoryRepo;


    @Override
    public Category_activity saveCategory(Category_activity category_activity) {
        return  categoryRepo.save(category_activity);
    }

    @Override
    public Category_activity updateCategory(Long id, Category_activity category_activity) {
        Category_activity category = categoryRepo.findById(id).get();
        category.setCategoryName(category_activity.getCategoryName());
        return categoryRepo.save(category);
    }

    @Override
    public List<Category_activity> findAll() {
        return null;
    }

    @Override
    public Optional<Category_activity> getCategoryName(String name) {
        return Optional.empty();
    }

    @Override
    public void deleteCategory(Long id) {

    }
}
