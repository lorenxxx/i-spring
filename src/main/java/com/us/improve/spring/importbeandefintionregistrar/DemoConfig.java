package com.us.improve.spring.importbeandefintionregistrar;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by Loren on 2018/10/31.
 */
@Configuration
@Import(MyBeanDefinitionRegistrar.class)
public class DemoConfig {
}
