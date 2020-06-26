package com.cnpc.demo.spring3x;

import com.cnpc.demo.spring3x2.Spring3xImportConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * spring3.x  纯注解去xml
 * configuration注解取代applicationContext.xml文件
 * ComponentScan注解取代<context:component-scan base-package="com.cnpc.demo.spring3x"/>
 * import注解取代<import resource="classpath:applicationContext1.xml"/>,导入配置类或者Bean
 */
@Import(Spring3xImportConfiguration.class)
@ComponentScan("com.cnpc.demo.spring3x")
@Configuration
public class Spring3xConfiguration {
    /**
     * 覆盖componentScan扫描的Spring3xService
     * @return
     */
    @Bean
    public Spring3xService spring3xService() {
        return new Spring3xService(2);
    }
}
