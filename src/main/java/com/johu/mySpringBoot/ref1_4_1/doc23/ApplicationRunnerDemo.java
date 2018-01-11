package com.johu.mySpringBoot.ref1_4_1.doc23;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author wennan
 * 2018/1/9
 */

@Component
public class ApplicationRunnerDemo implements ApplicationRunner{
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(getClass().getSimpleName());
    }
}
