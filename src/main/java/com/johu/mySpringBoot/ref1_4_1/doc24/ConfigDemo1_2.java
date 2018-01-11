package com.johu.mySpringBoot.ref1_4_1.doc24;

import com.johu.mySpringBoot.ref1_4_1.doc23.ApplicationContextEvent.ContextRefreshedEventDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * @author wennan
 * 2018/1/9
 */

@Configuration
@EnableConfigurationProperties(ConfigDemo1_1.class)
public class ConfigDemo1_2 implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    private ConfigDemo1_1 configDemo1_1;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println(configDemo1_1.getServers());
    }
}
