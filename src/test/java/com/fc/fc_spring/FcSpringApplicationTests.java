package com.fc.fc_spring;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fc.fc_spring.dto.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class FcSpringApplicationTests {

    @Test
    void contextLoads() throws JsonProcessingException {
        System.out.println("------");

        // Text 형태의 Json > object
        // Object > Text 형태의 Json

        //controller req json(text) > object
        // response object > json(text)
        ObjectMapper objectMapper = new ObjectMapper();

        // object > text
        // object mapper가 get method를 활용한다.
        User user = new User("steve", 18);
        String text = objectMapper.writeValueAsString(user);
        System.out.println(text);
        // text > object
        //object mapper는 default 생성자를 목표로 한다.
        // 또한 메서드명에서는 기본 생성자의 역할을 하는 메서드가 있다면 get을 빼주어야 정상 동작한다.
        Object objectUser = objectMapper.readValue(text, User.class);
        System.out.println(objectUser);

    }

}
