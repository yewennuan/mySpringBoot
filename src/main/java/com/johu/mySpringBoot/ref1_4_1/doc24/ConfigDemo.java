package com.johu.mySpringBoot.ref1_4_1.doc24;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wennan
 * 2018/1/9
 */

@Slf4j
@Configuration
@ConfigurationProperties(prefix = "my")
public class ConfigDemo implements ApplicationListener<ContextRefreshedEvent> {


    @NotNull
    private List<String> servers = new ArrayList<>();

    public List<String> getServers() {
        return this.servers;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        log.debug(servers.toString());

    }

}

