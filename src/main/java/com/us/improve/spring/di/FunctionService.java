package com.us.improve.spring.di;

import org.springframework.stereotype.Service;

/**
 * Created by Loren on 2018/10/27.
 */
@Service
public class FunctionService {

    public String sayHello(String word) {
        return "Hello " + word + " !";
    }

}
