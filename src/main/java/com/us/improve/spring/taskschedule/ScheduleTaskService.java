package com.us.improve.spring.taskschedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Loren on 2018/10/29.
 */
@Service
public class ScheduleTaskService {

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("每隔5秒执行一次 " + DATE_FORMAT.format(new Date()));
    }

    @Scheduled(cron = "0 45 20 ? * *")
    public void fixTimeExexution() {
        System.out.println("在指定时间 " + DATE_FORMAT.format(new Date()) + " 执行");
    }

}
