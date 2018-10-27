package com.us.improve.spring.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Loren on 2018/10/27.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);

        DemoSingletonService s1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService s2 = context.getBean(DemoSingletonService.class);

        System.out.println(s1 == s2);

        DemoPrototypeScope p1 = context.getBean(DemoPrototypeScope.class);
        DemoPrototypeScope p2 = context.getBean(DemoPrototypeScope.class);

        System.out.println(p1 == p2);

        context.close();
    }

}
