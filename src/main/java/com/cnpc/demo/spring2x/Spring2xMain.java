package com.cnpc.demo.spring2x;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Spring2xMain {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
        System.out.println(context.getBean(Spring2xService.class));
    }
}
