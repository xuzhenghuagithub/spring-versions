package com.cnpc.demo.spring3x3;

import com.cnpc.demo.spring1x.Spring1xService;
import com.cnpc.demo.spring2x.Spring2xService;
import com.cnpc.demo.spring3x.Spring3xService;
import com.cnpc.demo.spring3x2.Spring3xImportService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Spring3xSchedulerMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Spring3xSchedulerConfiguration.class);
    }
}
