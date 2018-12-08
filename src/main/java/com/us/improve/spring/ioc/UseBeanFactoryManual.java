package com.us.improve.spring.ioc;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * @ClassName UseIOC
 * @Desciption TODO
 * @Author Loren
 * @Date 2018/12/8 14:56
 * @Version 1.0
 **/
public class UseBeanFactoryManual {

    public static void main(String[] args) {
        ClassPathResource res = new ClassPathResource("beans.xml");
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(res);
    }

}
