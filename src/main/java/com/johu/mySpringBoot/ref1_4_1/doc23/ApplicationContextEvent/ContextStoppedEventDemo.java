package com.johu.mySpringBoot.ref1_4_1.doc23.ApplicationContextEvent;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.stereotype.Component;

/**
 * @author wennan
 * 2018/1/9
 * 使用场景，比如你想在spring容器启动后，触发或者开始某些操作
 */

/**
 * ConfigurableApplicationContext的stop()方法触发
 */
@Component
public class ContextStoppedEventDemo implements ApplicationListener<ContextStoppedEvent> {
    @Override
    public void onApplicationEvent(ContextStoppedEvent event) {
        //用springboot启动不会存在执行多次的情况0 0
        //可能会有多个容器存在，如果只想初始化一次，则添加这个if条件

        if(event.getApplicationContext().getParent()==null){
            System.out.println(getClass().getSimpleName());
        }
    }
}
