package com.example.demo.taskSchedule;

import java.time.LocalDateTime;

import org.springframework.scheduling.annotation.Scheduled;

public class ScheduleTask {

    @Scheduled(fixedRate = 10000) // Run every 10 seconds
    public void runMigrationCheck() {

        // This method will be called at the scheduled time
        System.out.println("Scheduled task executed at: " + LocalDateTime.now());
    }

}
