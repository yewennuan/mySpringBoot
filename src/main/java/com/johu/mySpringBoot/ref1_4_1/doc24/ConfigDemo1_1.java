package com.johu.mySpringBoot.ref1_4_1.doc24;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wennan
 * 2018/1/9
 */
@ConfigurationProperties(prefix = "my")
public class ConfigDemo1_1 {
    private List<String> servers = new ArrayList<>();

    public List<String> getServers() {
        return this.servers;
    }
}
