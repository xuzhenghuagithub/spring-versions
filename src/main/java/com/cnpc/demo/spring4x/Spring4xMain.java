package com.cnpc.demo.spring4x;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Spring4xMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Spring4xConditionConfiguration.class);
        System.out.println(context.getBean(Spring4xConditionService.class));
    }
}
