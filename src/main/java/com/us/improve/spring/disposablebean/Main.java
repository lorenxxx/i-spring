package com.us.improve.spring.disposablebean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName Main
 * @Desciption TODO
 * @Author loren
 * @Date 2019/7/6 11:55 PM
 * @Version 1.0
 **/
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        MyDisposableBean myDisposableBean = context.getBean(MyDisposableBean.class);
        System.out.println(myDisposableBean);
        context.close();
    }

}
