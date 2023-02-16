//package com.example.usersecurity.serviceImpl;
//
//import com.example.usersecurity.model.Activity;
//import com.example.usersecurity.repository.ActivityRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.time.LocalDate;
//
//
//@Component
//public class activityImplement  implements CommandLineRunner {
//    @Autowired
//    ActivityRepo activityRepo;
//
//    @Override
//    public void run(String... args) throws Exception {
//        Activity activity = new Activity(null,"restaurant", LocalDate.of(2023,02,01),"kigali",2000,"great",null,null);
//        Activity activity1 = new Activity(null,"Gaz",LocalDate.of(2022,02,15),"usa",3000,"well done",null,null);
//        Activity activity2 = new Activity(null,"Gaz",LocalDate.of(2022,02,16),"usa",3000,"well done",null,null);
//        activityRepo.save(activity);
//        activityRepo.save(activity1);
//        activityRepo.save(activity2);
//        System.out.println("list of Activity are "+activityRepo.count());
//
//
//    }
//}
