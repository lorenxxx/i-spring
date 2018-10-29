package com.us.improve.spring.taskschedule;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Loren on 2018/10/29.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskScheduleConfig.class);

        ScheduleTaskService scheduleTaskService = context.getBean(ScheduleTaskService.class);

        Thread.sleep(5000);

        scheduleTaskService.reportCurrentTime();
        scheduleTaskService.fixTimeExexution();

        context.close();

    }

}
