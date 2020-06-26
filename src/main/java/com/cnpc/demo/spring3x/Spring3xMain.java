package com.cnpc.demo.spring3x;

import com.cnpc.demo.spring3x2.Spring3xImportService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Spring3xMain {
    public static void main(String[] args) {
        //使用AnnotationConfigApplicationContext配置类装载时，Spring3xConfiguration的@Configuration注解可以省略
        ApplicationContext context = new AnnotationConfigApplicationContext(Spring3xConfiguration.class);
        //ApplicationContext context = new AnnotationConfigApplicationContext(Spring3xConfiguration.class, Spring3xImportConfiguration.class);
        System.out.println(context.getBean(Spring3xService.class).toString());
        System.out.println(context.getBean(Spring3xImportService.class));
    }
}
