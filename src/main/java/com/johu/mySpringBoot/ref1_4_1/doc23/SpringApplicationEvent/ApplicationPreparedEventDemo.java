package com.johu.mySpringBoot.ref1_4_1.doc23.SpringApplicationEvent;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author wennan
 * An ApplicationPreparedEvent is sent just before the refresh is started, but after bean definitions have been loaded
 * 在refresh开始前，但在bean定义已被加载后(加载定义，此时还没有实例化bean)，会发送一个ApplicationPreparedEvent
 * 2018/1/9
 */

//@Component spring-boot jar里面提供的listener都不能 用这种方式注入，因为该listener执行的时机在 bean初始化之前
public class ApplicationPreparedEventDemo implements ApplicationListener<ApplicationPreparedEvent> {

    @Override
    public void onApplicationEvent(ApplicationPreparedEvent event) {
        System.out.println(getClass().getSimpleName());
    }
}
