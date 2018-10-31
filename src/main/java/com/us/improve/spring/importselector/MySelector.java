package com.us.improve.spring.importselector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Created by Loren on 2018/10/31.
 */
public class MySelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[] {"com.us.improve.spring.import_.DemoService"};
    }

}
