package com.cnpc.demo.spring4x;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.cnpc.demo.spring4x")
public class Spring4xConditionConfiguration {
    @Conditional(MyCondition.class)
    @Bean
    public Spring4xConditionService spring4xConditionService(){
        return new Spring4xConditionService();
    }
}
