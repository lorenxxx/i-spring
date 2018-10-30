package com.us.improve.spring.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Loren on 2018/10/30.
 */
@Configuration
public class ConditionConfig {

    @Bean
    @Conditional(WindowsCondition.class)
    public ListService windowsListService() {
        return new WindowsListService();
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public ListService LinuxListService() {
        return new LinuxListService();
    }

    @Bean
    @Conditional(MacCondition.class)
    public ListService macListService() {
        return new MacListService();
    }

}
