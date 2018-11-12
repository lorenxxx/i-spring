package com.us.improve.spring.base64;

import java.util.Date;

/**
 * @author liangliang
 * @date 2018/11/13 12:13 AM
 */

public class User {

    private String name;

    private Integer age;

    private Date gmtCreate;

    public User() {
    }

    public User(String name, Integer age, Date gmtCreate) {
        this.name = name;
        this.age = age;
        this.gmtCreate = gmtCreate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

}
