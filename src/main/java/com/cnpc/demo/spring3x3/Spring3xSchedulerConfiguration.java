package com.cnpc.demo.spring3x3;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 使用Enable注解配置模块
 *
 */
@ComponentScan("com.cnpc.demo.spring3x3")
@EnableScheduling
@Configuration
public class Spring3xSchedulerConfiguration {
}
