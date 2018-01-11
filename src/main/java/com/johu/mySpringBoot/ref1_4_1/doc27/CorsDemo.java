package com.johu.mySpringBoot.ref1_4_1.doc27;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wennan
 * 2018/1/11
 */

//@CrossOrigin it don;t work why?
@RestController
public class CorsDemo {

    @RequestMapping(value = "/test1")
    public String greetings() {
        return "{\"project\":\"just a test\"}";
    }
}
