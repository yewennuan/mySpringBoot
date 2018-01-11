package com.johu.mySpringBoot.ref1_4_1.doc23.SpringApplicationEvent;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author wennan
 * An ApplicationEnvironmentPreparedEvent is sent when the Environment to be used in the context is known, but before the context is created
 * 在Environment将被用于已知的上下文，但在上下文被创建前，会发送一个ApplicationEnvironmentPreparedEvent
 * 2018/1/9
 */


//@Component spring-boot jar里面提供的listener都不能 用这种方式注入，因为该listener执行的时机在 bean初始化之前
public class ApplicationEnvironmentPreparedEventDemo implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {

    @Override
    public void onApplicationEvent(org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent event) {
        System.out.println(getClass().getSimpleName());
    }
}
