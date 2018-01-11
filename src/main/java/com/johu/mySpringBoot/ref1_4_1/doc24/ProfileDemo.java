package com.johu.mySpringBoot.ref1_4_1.doc24;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

/**
 * @author wennan
 * 1. java -jar xxx.jar --name="Spring"
 * 2. SPRING_APPLICATION_JSON='{"name":"Spring"}' java -jar xxx.jar
 * 3. java -Dspring.application.json='{"name":"Spring"}' -jar xxx.jar
 *
 * 2018/1/9
 */


@Slf4j
@Component
public class ProfileDemo implements ApplicationListener<ContextRefreshedEvent> {

    @Value("${name}")
    private String name;

    @Value("${random}")
    private String random;

    @Value("${copy}")
    private String copy;

    @Value("${my.servers[0]}")
    private String server1;

    @Value("${my.servers[1]}")
    private String server2;


    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        log.debug(name);
        log.debug(random);
        log.debug(copy);
        log.debug(server1);
        log.debug(server2);

    }
}
