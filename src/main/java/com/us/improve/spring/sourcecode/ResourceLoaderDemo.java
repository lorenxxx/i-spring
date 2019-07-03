package com.us.improve.spring.sourcecode;

import org.springframework.core.io.*;

/**
 * @ClassName ResourceLoaderDemo
 * @Desciption TODO
 * @Author loren
 * @Date 2019/7/3 11:58 AM
 * @Version 1.0
 **/
public class ResourceLoaderDemo {

    public static void main(String[] args) {
        ResourceLoader resourceLoader = new DefaultResourceLoader();

        Resource fileResource1 = resourceLoader.getResource("D:/Users/loren/Documents/Demo/spark.txt");
        System.out.println("fileResource1 is FileSystemResource: " + (fileResource1 instanceof FileSystemResource));

        Resource fileResource2 = resourceLoader.getResource("/Users/loren/Documents/Demo/spark.txt");
        System.out.println("fileResource2 is FileSystemResource: " + (fileResource2 instanceof FileSystemResource));

        Resource urlResource1 = resourceLoader.getResource("file:/Users/loren/Documents/Demo/spark.txt");
        System.out.println("urlResource1 is UrlResource:" + (urlResource1 instanceof UrlResource));

        Resource urlResource2 = resourceLoader.getResource("http://www.baidu.com");
        System.out.println("urlResource1 is urlResource:" + (urlResource2 instanceof  UrlResource));
    }

}
