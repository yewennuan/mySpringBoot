package com.johu.mySpringBoot.ref1_4_1.doc23.SpringApplicationEvent;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author wennan
 * An ApplicationStartingEvent is sent at the start of a run, but before any processing except the registration of listeners and initializers.
 * 在运行开始，但除了监听器注册和初始化以外的任何处理之前，会发送一个ApplicationStartedEvent
 * 2018/1/9
 */


//@Component spring-boot jar里面提供的listener都不能 用这种方式注入，因为该listener执行的时机在 bean初始化之前
public class ApplicationStartedEventDemo implements ApplicationListener<ApplicationStartedEvent> {

    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        System.out.println(getClass().getSimpleName());
    }
}
