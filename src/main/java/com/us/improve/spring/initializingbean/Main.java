package com.us.improve.spring.initializingbean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName Main
 * @Desciption TODO
 * @Author loren
 * @Date 2019/7/6 11:40 PM
 * @Version 1.0
 **/
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        MyInitializingBean myInitializingBean = context.getBean(MyInitializingBean.class);
        myInitializingBean.display();
    }

}
