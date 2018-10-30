package com.us.improve.spring.annotation;

import org.springframework.stereotype.Service;

/**
 * Created by Loren on 2018/10/30.
 */
@Service
public class DemoService {

    public void outputResult() {
        System.out.println("从组合注解配置照样活动的bean");
    }

}
