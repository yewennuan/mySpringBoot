package com.johu.mySpringBoot.ref1_4_1.doc23.SpringApplicationEvent;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author wennan
 * An ApplicationFailedEvent is sent if there is an exception on startup
 * 启动过程中如果出现异常，会发送一个ApplicationFailedEvent
 * 2018/1/9
 */

//@Component spring-boot jar里面提供的listener都不能 用这种方式注入，因为该listener执行的时机在 bean初始化之前
public class ApplicationFailedEventDemo implements ApplicationListener<ApplicationFailedEvent> {

    @Override
    public void onApplicationEvent(ApplicationFailedEvent event) {
        System.out.println(getClass().getSimpleName());
    }
}
