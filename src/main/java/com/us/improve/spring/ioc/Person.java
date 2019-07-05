package com.us.improve.spring.ioc;

/**
 * @ClassName Person
 * @Desciption TODO
 * @Author loren
 * @Date 2019/7/5 3:36 PM
 * @Version 1.0
 **/
public class Person {

    private String country;

    public Person() {}

    public Person(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Person{" +
                "country='" + country + '\'' +
                '}';
    }

}
