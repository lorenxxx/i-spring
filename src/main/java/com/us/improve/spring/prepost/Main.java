package com.us.improve.spring.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Loren on 2018/10/27.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);

        BeanWayService beanWayService = context.getBean(BeanWayService.class);

        JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);

        context.close();
    }

}
