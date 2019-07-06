package com.us.improve.spring.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Loren on 2018/10/29.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);

        MyAware awareService = context.getBean(MyAware.class);
        awareService.outputResult();
        awareService.display();

        context.close();
    }

}
