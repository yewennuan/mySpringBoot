package com.johu.mySpringBoot.ref1_4_1.doc27;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.util.BeanUtil;
import lombok.Data;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.jackson.JsonComponent;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Max;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.List;

/**
 * @author wennan
 * 2018/1/11
 */


@RestController
@RequestMapping(value="/users")
public class RestDemo {
    @RequestMapping(value="/{user}", method= RequestMethod.GET)
    public User getUser(@PathVariable Long user) {
        User userEntity = new User();
        userEntity.setId(user);
        userEntity.setName("johu");
        return userEntity;
    }

    @RequestMapping(value="/error", method= RequestMethod.GET)
    public User getUser() throws Exception {
        throw new Exception("it is a big surprise");
    }

    @RequestMapping(value="/{user}/customers", method=RequestMethod.GET)
    List<User> getUserCustomers(@PathVariable Long user) {
        User userEntity = new User();
        userEntity.setId(user);
        User userEntity1 = new User();
        User userEntity2 = new User();
        BeanUtils.copyProperties(userEntity,userEntity1);
        BeanUtils.copyProperties(userEntity,userEntity2);
        return Arrays.asList(userEntity1,userEntity2);
    }

    @RequestMapping(value="/{user}", method=RequestMethod.DELETE)
    public User deleteUser(@PathVariable Long user) {
        return null;
    }
}

@Data
class  User {
    @JsonSerialize(using = SerializeTest.class)
    private Long id;
    private String name;
}

class SerializeTest extends JsonSerializer<Long> {

    @Override
    public void serialize(Long value, JsonGenerator jgen, SerializerProvider provider)
            throws IOException, JsonProcessingException {
        value = value*10;
        jgen.writeString(value.toString());
    }

}



class DeserializeTest extends JsonDeserializer<Long> {

    @Override
    public Long deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        String temp = jp.getText();
        return Long.parseLong(temp)*100;
    }

}
