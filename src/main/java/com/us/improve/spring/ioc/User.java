package com.us.improve.spring.ioc;

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

    private Car car;

    public User() {

    }

    public User(String name, String password, Car car) {
        super("CHN");
        this.name = name;
        this.password = password;
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
