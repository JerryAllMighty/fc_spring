package com.fc.fc_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // ㅎㅐ당 class는 rest api 처리하는 controller
@RequestMapping("/api") //Request Mapping URI를 지정해주는 Annotation
public class ApiController {
    @GetMapping("/hello")
    public String hello() {
        return "hello spring boot";

    }

}
