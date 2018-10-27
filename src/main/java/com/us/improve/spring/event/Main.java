package com.us.improve.spring.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Loren on 2018/10/27.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);

        DemoPublisher publisher = context.getBean(DemoPublisher.class);

        publisher.publish("hi, monkey");

        context.close();
    }

}
