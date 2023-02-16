package com.example.usersecurity.controller;

import com.example.usersecurity.model.Activity;
import com.example.usersecurity.service.ActivityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class ActivityControllerAPI {
    private final ActivityService activityService;

    @PostMapping("/save")
    public ResponseEntity<Activity> saveActivity(@RequestBody Activity activity){
        return ResponseEntity.ok(activityService.createActivity(activity));
    }
    @GetMapping("/findAll")
    public ResponseEntity<?> getAllAct(){
        return ResponseEntity.ok(activityService.getAllActivity());
    }
    @GetMapping("/greetings")
    public String hello(){
        return "welcome to united state of america";
    }
}
