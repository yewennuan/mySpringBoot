package com.johu.mySpringBoot.ref1_4_1.doc27;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;

/**
 * @author wennan
 * 2018/1/11
 * - if you have configured your own JacksonObjectMapperBuilder then you're telling Spring Boot's Jackson auto-configuration to (largely) back off. As explained in the javadoc for @JsonComponent it takes effect "when JsonComponentModule is in use". You haven't configured your object mapper builder with JsonComponentModule so it isn't in use. Therefore, @JsonComponent has no effect
 * - jsonCompnent注解能使 @jsonSeriable注解无效
 */

//@JsonComponent
public class JsonComponentDemo extends JsonSerializer<User> {

    @Override
    public void serialize(User user, JsonGenerator jgen, SerializerProvider provider)
            throws IOException, JsonProcessingException {
        jgen.writeStartObject();
        jgen.writeNumberField("id",user.getId());
        jgen.writeStringField("name","yewennuan");
        jgen.writeEndObject();
    }

}
