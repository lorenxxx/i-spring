package com.us.improve.spring.ioc.resourceloader;

import org.springframework.core.io.ProtocolResolver;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.lang.Nullable;

/**
 * @ClassName MyProtocolResolver
 * @Desciption ProtocolResolver作为DefaultResourceLoader的SPI，它允许用户自定义资源加载协议，而不需要继承ResourceLoader 的子类。
 * @Author loren
 * @Date 2019/7/16 2:14 PM
 * @Version 1.0
 **/
public class MyProtocolResolver implements ProtocolResolver {

    @Nullable
    @Override
    public Resource resolve(String location, ResourceLoader resourceLoader) {
        return null;
    }

}
