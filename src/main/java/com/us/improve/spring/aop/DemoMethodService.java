package com.us.improve.spring.aop;

import org.springframework.stereotype.Service;

/**
 * Created by Loren on 2018/10/27.
 */
@Service
public class DemoMethodService {

    public void add() {
        System.out.println("invoke DemoMethodService.add()");
    }

}
