package com.us.improve.spring.aop;

import java.lang.annotation.*;

/**
 * Created by Loren on 2018/10/27.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {

    String name();

}
