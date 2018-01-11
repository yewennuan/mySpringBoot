package com.johu.mySpringBoot.ref1_4_1.doc24;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;

import javax.validation.constraints.Min;
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

    /**
     * 使用Spring DataBinder工具集绑定这些属性（这是@ConfigurationProperties做的事）时，
     * 你需要属性有一个setter或使用可变的值初始化它
     *
     */

    // 该属性有setter和getter
    @Min(value = 1) //javax.validation注解在@ConfigurationProperties注解下生效
    private Integer age;


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    //该属性有getter和初始值
    private List<String> servers = new ArrayList<>();

    public List<String> getServers() {
        return this.servers;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        log.debug(servers.toString());
        log.debug(age.toString());

    }

}

