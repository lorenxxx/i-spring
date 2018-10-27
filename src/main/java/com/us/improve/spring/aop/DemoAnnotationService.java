package com.us.improve.spring.aop;

import org.springframework.stereotype.Service;

/**
 * Created by Loren on 2018/10/27.
 */
@Service
public class DemoAnnotationService {

    @Action(name = "注解式拦截的add操作")
    public void add() {
        System.out.println("invoke DemoAnnotationService.add()");
    }

}
