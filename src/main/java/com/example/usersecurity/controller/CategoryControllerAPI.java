package com.example.usersecurity.controller;

import com.example.usersecurity.model.Category_activity;
import com.example.usersecurity.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class CategoryControllerAPI {
    private final CategoryService categoryService;
    @PostMapping("/record")
    public ResponseEntity<Category_activity> recordActivity(@RequestBody Category_activity category_activity){
        return ResponseEntity.ok(categoryService.saveCategory(category_activity));

    }

}
