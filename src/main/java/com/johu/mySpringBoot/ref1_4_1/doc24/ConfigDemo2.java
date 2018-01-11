package com.johu.mySpringBoot.ref1_4_1.doc24;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wennan
 * 2018/1/9
 */

@Slf4j
@Configuration
public class ConfigDemo2 implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private MyComponent myComponent;


    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        log.debug(myComponent.toString());

    }

    @Bean
    @ConfigurationProperties(prefix = "my")
    public MyComponent myComponent(){
        return new MyComponent();
    }
}


class MyComponent{
    private List<String> servers = new ArrayList<>();

    public List<String> getServers() {
        return this.servers;
    }
}
