package com.johu.mySpringBoot.ref1_4_1.doc27;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.boot.jackson.JsonComponentModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

/**
 * @author wennan
 * 2018/1/11
 * 自己定制 java对象->httprequest,httpresponse，httprequest,httpresponse->java对象 的一些处理过程
 */


//@Configuration
public class HttpMessageConverterConfig {

    @Bean
    public HttpMessageConverters customConverters() {

        /**
         *
         * spring-boot默认使用jackson的HttpMessageConverter
         * jackson 默认返回null属性的字段
         * 如 get请求 localhost:8080/mySpringBoot/users/1,返回 {"id":1,"name":null}
         *
         */
        HttpMessageConverter<?> another = new MappingJackson2HttpMessageConverter();
        return new HttpMessageConverters(another);


        /**
         * fastjson 默认不返回null属性的字段
         * 如 get请求 localhost:8080/mySpringBoot/users/1,返回 {"id":1}
         *
         */
//        HttpMessageConverter<?> additional = new FastJsonHttpMessageConverter();
//        return new HttpMessageConverters(additional);


        /**
         * 自己对jackson messageConverts做一些定制,如去掉null的字段
         */
//        AbstractJackson2HttpMessageConverter abstractJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
//        abstractJackson2HttpMessageConverter.setObjectMapper(objectMapper);
//        return new HttpMessageConverters(abstractJackson2HttpMessageConverter);

    }



}
