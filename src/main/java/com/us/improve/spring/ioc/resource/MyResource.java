package com.us.improve.spring.ioc.resource;

import org.springframework.core.io.AbstractResource;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName MyResource
 * @Desciption 如果我们想要实现自定义的 Resource ，记住不要实现 Resource 接口，而应该继承 AbstractResource 抽象类，然后根据当前的具体资源特性覆盖相应的方法即可。
 * @Author loren
 * @Date 2019/7/16 11:08 AM
 * @Version 1.0
 **/
public class MyResource extends AbstractResource {

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return null;
    }

}
