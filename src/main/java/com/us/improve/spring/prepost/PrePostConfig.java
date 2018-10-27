package com.us.improve.spring.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Loren on 2018/10/27.
 */
@Configuration
@ComponentScan("com.us.improve.spring.prepost")
public class PrePostConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    BeanWayService beanWayService() {
        return new BeanWayService();
    }

    @Bean
    JSR250WayService jsr250WayService() {
        return new JSR250WayService();
    }

}
