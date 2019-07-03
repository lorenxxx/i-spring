package com.us.improve.spring.scan;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @ClassName MyComponent
 * @Desciption TODO
 * @Author loren
 * @Date 2019/4/3 12:42 PM
 * @Version 1.0
 **/
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface MyComponent {

    String value() default "";

}