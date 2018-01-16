package com.johu.mySpringBoot.ref1_4_1.doc28;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wennan
 * pom 里需要添加spring-boot-starter-thymeleaf localhost:8080才能定位到这里，
 * 如果没加，相当于去statci文件夹下找名为index的文件，那肯定找不到的。可以去掉pom里的该依赖试试看就知道了
 * 2018/1/16
 */

@Controller
public class SecurityDemo {

    @RequestMapping("/sdindex")
    public String staticIndex() {
        return "index.html";
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }


}
