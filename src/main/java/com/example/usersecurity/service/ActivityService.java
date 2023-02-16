package com.example.usersecurity.service;

import com.example.usersecurity.model.Activity;
import com.example.usersecurity.model.Category_activity;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface ActivityService {
    Activity createActivity(Activity activity);
    List<Activity> getAllActivity();
    Activity updateActivity(Long id,Activity activity);
    Optional<Activity> findById(Long id);

    void deleteById(Long id);
    public BigDecimal totalAmount();






}
