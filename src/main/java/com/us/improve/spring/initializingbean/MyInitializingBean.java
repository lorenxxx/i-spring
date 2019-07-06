package com.us.improve.spring.initializingbean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @ClassName MyInitializingBean
 * @Desciption TODO
 * @Author loren
 * @Date 2019/7/6 11:38 PM
 * @Version 1.0
 **/
@Component
public class MyInitializingBean implements InitializingBean {

    private String name = "Hello";

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Invoke InitializingBean.afterPropertiesSet()");
        //this.name = "World";
    }

    @Override
    public String toString() {
        return "MyInitializingBean{" +
                "name='" + name + '\'' +
                '}';
    }

    public void display() {
        System.out.println(this);
    }

}
