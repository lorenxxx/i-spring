package com.us.improve.spring.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Loren on 2018/10/27.
 */
public class JSR250WayService {

    @PostConstruct
    public void init() {
        System.out.println("jsr250-init-method");
    }

    public JSR250WayService() {
        System.out.println("初始化构造函数-JSR250WayService");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("jsr250-destroy-method");
    }

}
