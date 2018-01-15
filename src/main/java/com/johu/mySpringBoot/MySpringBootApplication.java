package com.johu.mySpringBoot;

import com.johu.mySpringBoot.ref1_4_1.doc23.SpringApplicationEvent.ApplicationStartedEventDemo;
import com.johu.mySpringBoot.ref1_4_1.doc23.SpringApplicationEvent.ApplicationPreparedEventDemo;
import com.johu.mySpringBoot.ref1_4_1.doc23.SpringApplicationEvent.ApplicationFailedEventDemo;
import com.johu.mySpringBoot.ref1_4_1.doc23.SpringApplicationEvent.ApplicationEnvironmentPreparedEventDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.*;

@SpringBootApplication
public class MySpringBootApplication {

	public static void main(String[] args) {

		MySpringBootApplication mySpringBootApplication = new MySpringBootApplication();

		SpringApplication springApplication = new SpringApplication(MySpringBootApplication.class);

		//可在这里配置，也可以在 spring.factories里配置，
		//springApplication.addListeners(new ApplicationStartedEventDemo(),new ApplicationPreparedEventDemo(),new ApplicationFailedEventDemo(),new ApplicationEnvironmentPreparedEventDemo());
		ConfigurableApplicationContext configurableApplicationContext = springApplication.run(args);

		//禁用命令行配置参数 以'--'开头，比如--server.port=9000
		//springApplication.setAddCommandLineProperties(false);

		//触发 ContextStartedEvent,ContextClosedEvent这两个监听器
//		configurableApplicationContext.start();
//		configurableApplicationContext.stop();

	}
}
