package com.us.improve.spring.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by Loren on 2018/10/27.
 */
public class DemoEvent extends ApplicationEvent {

    private String msg;

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public DemoEvent(Object source, String msg) {
        super(source);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
