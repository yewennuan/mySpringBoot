package com.johu.mySpringBoot.ref1_4_1.doc23;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author wennan
 * 2018/1/9
 */

@Component
public class ApplicationArgumentsDemo {

    @Autowired
    public ApplicationArgumentsDemo(ApplicationArguments args) {
        System.out.println(getClass().getSimpleName());
    }
}
