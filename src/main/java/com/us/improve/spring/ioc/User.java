package com.us.improve.spring.ioc;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName User
 * @Desciption TODO
 * @Author Loren
 * @Date 2018/12/8 16:02
 * @Version 1.0
 **/
public class User extends Person {

    private String name;

    private String password;

    @Autowired
    private Car car;

    public User() {

    }

    public User(String name, String password) {
        super("CHN");
        this.name = name;
        this.password = password;
    }

    public User(String name, String password, Car car) {
        super("CHN");
        this.name = name;
        this.password = password;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", car=" + car +
                '}';
    }

}
