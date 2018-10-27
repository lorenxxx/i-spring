package com.us.improve.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Loren on 2018/10/27.
 */
@Configuration
@ComponentScan("com.us.improve.spring.aop")
@EnableAspectJAutoProxy
public class AopConfig {



}
