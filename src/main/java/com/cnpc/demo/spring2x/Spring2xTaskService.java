package com.cnpc.demo.spring2x;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 使用配置文件加注解驱动
 * 配置scheduler模块
 * <task:annotation-driven scheduler="scheduler"/>开启的scheduler注解驱动AnnotationDrivenBeanDefinitionParser解析scheduled注解,配置定时器
 */
@Service
public class Spring2xTaskService {
    @Scheduled(fixedRate = 2000)
    public void reportCurrentTime(){
        System.out.println("current time:"+new Date());
    }

}
