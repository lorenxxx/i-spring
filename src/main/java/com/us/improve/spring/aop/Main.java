package com.us.improve.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Loren on 2018/10/27.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);

        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);

        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);

        demoAnnotationService.add();

        demoMethodService.add();

        context.close();
    }

}
