package com.cnpc.demo.spring3x3;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 使用Enable注解
 * 配置scheduler模块
 */
@Service
public class Spring3xTaskService {
    @Scheduled(fixedRate = 2000)
    public void reportCurrentTime(){
        System.out.println("current time:"+new Date());
    }

}
