package com.example.usersecurity.serviceImpl;

import com.example.usersecurity.model.Activity;
import com.example.usersecurity.repository.ActivityRepo;
import com.example.usersecurity.service.ActivityService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

import java.util.List;
import java.util.Optional;
@Service
@Transactional
@RequiredArgsConstructor
public class ActivityServiceImpl  implements ActivityService {
    private final ActivityRepo activityRepo;

    @Override
    public Activity createActivity(Activity activity) {
        try {
            return activityRepo.save(activity);

        }catch (Exception e){
            throw new RuntimeException(e);

        }

    }

    @Override
    public List<Activity> getAllActivity() {
        return activityRepo.findAll();
    }


    @Override
    public Activity updateActivity(Long id, Activity activity) {
        try {
            Activity activity1 = activityRepo.findById(id).get();
            activity1.setNameOfActivity(activity.getNameOfActivity());
            activity1.setDate(activity.getDate());
            activity1.setAddress(activity.getAddress());
            activity1.setAmount(activity.getAmount());
            activity1.setComment(activity.getComment());

           return activityRepo.save(activity1);



        }catch (Exception ex){
            throw new RuntimeException("Please checked  all field before update it !!!");
        }

    }

    @Override
    public Optional<Activity> findById(Long id) {
        return activityRepo.findById(id);
    }



    @Override
    public void deleteById(Long id) {
        try {
            activityRepo.deleteById(id);

        }catch (Exception ex){
            throw new RuntimeException("try again your Activity was not recorded");
        }

    }

    @Override
    public BigDecimal totalAmount() {
        return activityRepo.totalAmount();
    }


}
