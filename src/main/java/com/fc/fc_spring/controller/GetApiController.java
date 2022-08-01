package com.fc.fc_spring.controller;

import com.fc.fc_spring.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {
    @GetMapping("/hello")
    public String getHello() {
        return "get Hello";

    }

    @RequestMapping(path = "/hi", method = RequestMethod.GET) // get, post, put, delete 모두 가능하기에 method를 명시.
    public String hi() {
        return "hi";
    }

    //Path Variable
    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable(name = "name") String pathName) {
        return pathName;

    }

    //쿼리 스트링, RequestParam 활용
    @GetMapping(path = "query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam) {
        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach(entry -> {
            sb.append(entry.getKey() + "=" + entry.getValue() + "\n");
        });
        return sb.toString();

    }

    @GetMapping(path = "query-param02")
    public String queryParam02(@RequestParam String name, @RequestParam String email, @RequestParam int age) {
        return name + " " + email + " " + Integer.toString(age);

    }

    @GetMapping(path = "query-param03")
    public String queryParam03(UserRequest userRequest) {
        return userRequest.toString();

    }
}
