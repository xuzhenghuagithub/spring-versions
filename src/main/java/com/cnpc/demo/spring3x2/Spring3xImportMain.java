package com.cnpc.demo.spring3x2;

import com.cnpc.demo.spring1x.Spring1xService;
import com.cnpc.demo.spring2x.Spring2xService;
import com.cnpc.demo.spring3x.Spring3xService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Spring3xImportMain {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
        System.out.println(context.getBean(Spring1xService.class));
        System.out.println(context.getBean(Spring2xService.class));
        System.out.println(context.getBean(Spring3xImportService.class));
        System.out.println(context.getBean(Spring3xService.class).toString());
    }
}
