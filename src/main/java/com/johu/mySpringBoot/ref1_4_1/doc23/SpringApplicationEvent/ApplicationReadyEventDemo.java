package com.johu.mySpringBoot.ref1_4_1.doc23.SpringApplicationEvent;

import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author wennan
 * An ApplicationReadyEvent is sent after the refresh and any related callbacks have been processed to indicate the application is ready to service requests.
 * 在refresh之后，相关的回调处理完，会发送一个ApplicationReadyEvent，表示应用准备好接收请求了
 * 2018/1/9
 */

@Component //因为是在refresh之后，所以可以直接用@Component注入，因为ApplicationReadyEvent的触发时机在bean实例化完成之后
public class ApplicationReadyEventDemo implements ApplicationListener<ApplicationReadyEvent> {

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        System.out.println(getClass().getSimpleName());
    }
}
