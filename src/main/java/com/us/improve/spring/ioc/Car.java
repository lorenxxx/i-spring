package com.us.improve.spring.ioc;

/**
 * @ClassName Car
 * @Desciption TODO
 * @Author loren
 * @Date 2019/7/5 3:24 PM
 * @Version 1.0
 **/
public class Car {

    private String brand;

    private String type;

    public Car() {

    }

    public Car(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public void init() {
        this.type = "R8";
    }

}
