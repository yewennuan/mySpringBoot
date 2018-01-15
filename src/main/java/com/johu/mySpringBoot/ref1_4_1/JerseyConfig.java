package com.johu.mySpringBoot.ref1_4_1;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.xml.ws.Endpoint;

/**
 * @author wennan
 * 2018/1/15
 */

// 创建一个ResourceConfig类型的@Bean，用于注册所有的端点(endpoints) ,并没生效，如果想用jax-rs可以参考官方文档上的列子 https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples/spring-boot-sample-jersey
//@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig(){
        register(Endpoint.class);
    }
}
