package com.johu.mySpringBoot.ref1_4_1.doc23;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @author wennan
 * 2018/1/9
 */

@Component
public class ContextRefreshedEventDemo implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        //可能会有多个容器存在，如果只想初始化一次，则添加这个if条件
        if(event.getApplicationContext().getParent()==null){
            System.out.println(1);
        }
    }
}
