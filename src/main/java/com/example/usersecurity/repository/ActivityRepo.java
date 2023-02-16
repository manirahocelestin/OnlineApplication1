package com.example.usersecurity.repository;

import com.example.usersecurity.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


@Repository
public interface ActivityRepo extends JpaRepository<Activity,Long> {
    Activity findByNameOfActivity(String nameOfActivity);

    @Query(value = "select sum(amount) from Activity ")
    public BigDecimal totalAmount();
    /*
     @Query(nativeQuery = true, value="select * from Activity c where c.date between :startDate and :endDate")
   List<Activity> getData_between(@Param("startDate") LocalDate date, @Param("endDate") LocalDate date2);
     */
    @Query(nativeQuery = true, value = "select * from Activity c where c.date between :startDate and :endDate")
    List<Activity> getData_between(@Param("startDate") LocalDate date, @Param("endDate") LocalDate date2);



}
