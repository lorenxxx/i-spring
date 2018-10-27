package com.us.improve.spring.prepost;

/**
 * Created by Loren on 2018/10/27.
 */
public class BeanWayService {

    public void init() {
        System.out.println("@Bean-init-method");
    }

    public BeanWayService() {
        super();
        System.out.println("初始化构造函数-BeanWayService");
    }

    public void destroy() {
        System.out.println("@Bean-destroy-method");
    }

}
