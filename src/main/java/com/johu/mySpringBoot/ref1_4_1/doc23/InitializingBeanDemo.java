package com.johu.mySpringBoot.ref1_4_1.doc23;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author wennan
 * 2018/1/9
 */

@Component
public class InitializingBeanDemo implements InitializingBean {

    public InitializingBeanDemo() {
        System.out.println("constructor");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("postConstruct");
    }


}
