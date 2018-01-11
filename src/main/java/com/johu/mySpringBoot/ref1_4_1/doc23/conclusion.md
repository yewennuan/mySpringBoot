
- 感悟：
    - 实现SpringApplicationEvent接口的类都是spring-boot jar里面引进来的，是spring-boot特有的
    - 实现ApplicationContextEvent接口的类是spring-context jar里面就有的



- 现象：
    - 实现 ApplicationContextEvent接口 或者 SpringApplicationEvent接口 或者 InitializingBean接口 以及 @PostConstruct的执行时间顺序，如下:



    ApplicationStartedEventDemo
    ApplicationEnvironmentPreparedEventDemo
    
     =v= =v= =v=
    wennan-custom-banner
        =3= =3= =3=
     (v1.4.1.RELEASE)
     
    2018-01-09 14:52:39.954  INFO 92983 --- [           main] c.j.m.MySpringBootApplication            : Starting MySpringBootApplication on localhost with PID 92983 (/Users/johu/Documents/mySpringBoot/target/classes started by johu in /Users/johu/Documents/mySpringBoot)
    2018-01-09 14:52:39.958  INFO 92983 --- [           main] c.j.m.MySpringBootApplication            : No active profile set, falling back to default profiles: default
    ApplicationPreparedEventDemo
    2018-01-09 14:52:40.061  INFO 92983 --- [           main] s.c.a.AnnotationConfigApplicationContext : Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@15043a2f: startup date [Tue Jan 09 14:52:40 CST 2018]; root of context hierarchy
    ApplicationArgumentsDemo
    constructor
    postConstruct
    afterPropertiesSet
    2018-01-09 14:52:40.823  INFO 92983 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
    ContextRefreshedEventDemo
    ApplicationRunnerDemo
    CommandlineRunnerDemo
    ApplicationReadyEventDemo
    2018-01-09 14:52:40.837  INFO 92983 --- [           main] c.j.m.MySpringBootApplication            : Started MySpringBootApplication in 1.362 seconds (JVM running for 2.191)
    ContextStartedEventDemo（ps. 要通过configurableApplicationContext.start();触发才行）
    ContextStoppedEventDemo ps. 要通过configurableApplicationContext.stop();触发才行）
    2018-01-09 14:52:40.840  INFO 92983 --- [       Thread-6] s.c.a.AnnotationConfigApplicationContext : Closing org.springframework.context.annotation.AnnotationConfigApplicationContext@15043a2f: startup date [Tue Jan 09 14:52:40 CST 2018]; root of context hierarchy
    ContextClosedEventDemo
    2018-01-09 14:52:40.841  INFO 92983 --- [       Thread-6] o.s.j.e.a.AnnotationMBeanExporter        : Unregistering JMX-exposed beans on shutdown
   
    