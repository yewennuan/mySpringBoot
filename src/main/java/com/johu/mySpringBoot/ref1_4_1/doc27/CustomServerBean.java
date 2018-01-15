package com.johu.mySpringBoot.ref1_4_1.doc27;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.stereotype.Component;

/**
 * @author wennan
 * 2018/1/15
 */
//可以通过这种方式设置一些在application.yml里没有设置项的设置
//@Component
public class CustomServerBean implements EmbeddedServletContainerCustomizer {
    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        container.setPort(9000);
    }
}
