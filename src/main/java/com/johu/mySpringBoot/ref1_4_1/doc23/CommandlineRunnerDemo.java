package com.johu.mySpringBoot.ref1_4_1.doc23;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author wennan
 * 2018/1/9
 */

@Component
public class CommandlineRunnerDemo implements CommandLineRunner{

    @Override
    public void run(String... args) throws Exception {
        System.out.println(getClass().getSimpleName());
    }
}
