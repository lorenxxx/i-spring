package com.us.improve.spring.javaconfig;

/**
 * Created by Loren on 2018/10/27.
 */
public class UseFunctionService {

    FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String sayHello(String word) {
        return functionService.sayHello(word);
    }

}
