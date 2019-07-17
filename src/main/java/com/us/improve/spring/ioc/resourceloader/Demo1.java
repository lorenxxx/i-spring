package com.us.improve.spring.ioc.resourceloader;

import org.springframework.core.io.*;

/**
 * @ClassName Demo
 * @Desciption 演示 DefaultResourceLoader 加载资源的具体策略
 * @Author loren
 * @Date 2019/7/16 2:19 PM
 * @Version 1.0
 **/
public class Demo1 {

    public static void main(String[] args) {
        ResourceLoader resourceLoader = new DefaultResourceLoader();

        Resource fileResource1 = resourceLoader.getResource("D:/Users/loren/Desktop/spark.txt");
        System.out.println("fileResource1 is FileSystemResource: " + (fileResource1 instanceof FileSystemResource));

        Resource fileResource2 = resourceLoader.getResource("/Users/loren/Desktop/spark.txt");
        System.out.println("fileResource2 is ClassPathResource: " + (fileResource2 instanceof ClassPathResource));

        Resource urlResource1 = resourceLoader.getResource("file:/Users/loren/Desktop/spark.txt");
        System.out.println("urlResource1 is UrlResource: " + (urlResource1 instanceof UrlResource));

        Resource urlResource2 = resourceLoader.getResource("http://www.baidu.com");
        System.out.println("urlResource1 is urlResource: " + (urlResource2 instanceof  UrlResource));

        ResourceLoader fileSystemResourceLoader = new FileSystemResourceLoader();
        fileResource1 = fileSystemResourceLoader.getResource("D:/Users/loren/Desktop/spark.txt");
        System.out.println("fileResource1 is FileSystemResource: " + (fileResource1 instanceof FileSystemResource));
    }

}
