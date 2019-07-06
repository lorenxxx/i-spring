package com.us.improve.spring.beanpostprocessor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName Main
 * @Desciption TODO
 * @Author loren
 * @Date 2019/7/6 11:04 PM
 * @Version 1.0
 **/
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        MyBeanPostProcessor myBeanPostProcessor = context.getBean(MyBeanPostProcessor.class);
        myBeanPostProcessor.display();
    }

}
