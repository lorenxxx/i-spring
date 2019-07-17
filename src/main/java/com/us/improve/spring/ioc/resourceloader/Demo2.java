package com.us.improve.spring.ioc.resourceloader;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName Demo2
 * @Desciption TODO
 * @Author loren
 * @Date 2019/7/17 11:14 AM
 * @Version 1.0
 **/
public class Demo2 {

    public static void main(String[] args) throws IOException {
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();

        Resource fileResource1 = resolver.getResource("D:/Users/loren/Desktop/spark.txt");
        System.out.println("fileResource1 is FileSystemResource: " + (fileResource1 instanceof FileSystemResource));

        String locationPrefix = "classpath:/";
        String locationPattern = "classpath:/hello.yml";
        System.out.println(locationPattern.substring(locationPrefix.length()));

        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("world");

        String[] temp = new String[2];
        System.out.println("temp: " + temp);

        String[] arr = set.toArray(temp);
        System.out.println("arr: " + arr);
    }

}
