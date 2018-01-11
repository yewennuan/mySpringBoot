package com.johu.mySpringBoot.ref1_4_1.doc25;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author wennan
 * 2018/1/9
 */

@Configuration
@Profile("test")
//-Dspring.profiles.active=test 启动时加上这个系统变量参数才能实例化
public class ProductionConfiguration {
    public ProductionConfiguration() {
        System.out.println(1);
    }
}
