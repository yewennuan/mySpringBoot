package com.johu.mySpringBoot.ref1_4_1.doc27;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author wennan
 * 2018/1/15
 */

//@Component
@Path("/jersey")
public class JerseyDemo {

    @GET
    @Path("/hello")
    public String jersey(){
        return "jersey";
    }
}
