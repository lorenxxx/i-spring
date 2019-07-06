package com.us.improve.spring.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * Created by Loren on 2018/10/29.
 */
@Component
public class MyAware implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware, ResourceLoaderAware, ApplicationContextAware  {

    private String beanName;

    private ClassLoader classLoader;

    private BeanFactory beanFactory;

    private ResourceLoader resourceLoader;

    private ApplicationContext applicationContext;

    @Override
    public void setBeanName(String name) {
        System.out.println("invoke BeanNameAware.setBeanName()");
        this.beanName = name;
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("invoke BeanClassLoader.setBeanClassLoader");
        this.classLoader = classLoader;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("invoke BeanFactory.setBeanFactory()");
        this.beanFactory = beanFactory;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        System.out.println("invoke ResourceLoaderAware.setResourceLoader()");
        this.resourceLoader = resourceLoader;
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("invoke ApplicationContextAware.setApplicationContext()");
        this.applicationContext = applicationContext;
    }

    public void outputResult() {
        System.out.println("Bean的名称为：" + beanName);

        Resource resource = resourceLoader.getResource("classpath:com/us/improve/spring/aware/test.txt");
        try {
            System.out.println("ResourceLoader加载的文件内容为：" + IOUtils.toString(resource.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void display(){
        System.out.println("beanName:" + beanName);
        System.out.println("是否为单例：" + beanFactory.isSingleton(beanName));
        System.out.println("系统环境为：" + applicationContext.getEnvironment());
    }

}
