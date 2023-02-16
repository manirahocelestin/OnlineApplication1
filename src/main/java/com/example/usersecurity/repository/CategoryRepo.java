package com.example.usersecurity.repository;

import com.example.usersecurity.model.Category_activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository

public interface CategoryRepo extends JpaRepository<Category_activity,Long> {

    Optional<Category_activity> findByCategoryName(String categoryName);
}
