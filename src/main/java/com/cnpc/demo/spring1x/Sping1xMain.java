package com.cnpc.demo.spring1x;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Sping1xMain {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
        System.out.println(context.getBean(Spring1xService.class));
    }
}
