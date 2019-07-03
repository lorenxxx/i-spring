package com.us.improve.spring.scan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName Main1
 * @Desciption TODO
 * @Author loren
 * @Date 2019/4/3 12:45 PM
 * @Version 1.0
 **/
@Configuration
public class Main1 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Main1.class);
        context.refresh();

        InjectClass injectClass = context.getBean(InjectClass.class);
        injectClass.print();
    }

    @MyComponent
    public static class InjectClass {
        public void print() {
            System.out.println("hello, it's me.");
        }
    }

}
