package com.johu.mySpringBoot.ref1_4_1.doc27;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wennan
 * 2018/1/11
 * 跨域可开两个项目，在application.yml里 通过server.port属性将端口设成9000起个工程，再改为8080再起一个工程，
 * 不同端口也是算跨域的，所以能进行跨域的demo演示
 */

//@CrossOrigin it don;t work why?
@RestController
public class CorsDemo {

    @RequestMapping(value = "/test1")
    public String greetings() {
        return "{\"project\":\"just a test\"}";
    }
}
