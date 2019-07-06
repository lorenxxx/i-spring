package com.us.improve.spring.disposablebean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

/**
 * @ClassName MyDisposableBean
 * @Desciption TODO
 * @Author loren
 * @Date 2019/7/6 11:54 PM
 * @Version 1.0
 **/
@Component
public class MyDisposableBean implements DisposableBean {

    @Override
    public void destroy() throws Exception {
        System.out.println("Invoke DisposableBean.destroy()");
    }

}
