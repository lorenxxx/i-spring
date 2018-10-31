package com.us.improve.spring.import_;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by Loren on 2018/10/31.
 */
@Configuration
@Import(DemoService.class)
public class DemoConfig {

}
