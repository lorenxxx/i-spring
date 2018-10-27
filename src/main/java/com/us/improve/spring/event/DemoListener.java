package com.us.improve.spring.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by Loren on 2018/10/27.
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    @Override
    public void onApplicationEvent(DemoEvent event) {
        String msg = event.getMsg();

        System.out.println("bean-demoListener接收到了bean-demoPublisher发布的消息：" + msg);
    }

}
