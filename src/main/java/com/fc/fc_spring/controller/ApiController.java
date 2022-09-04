package com.fc.fc_spring.controller;

import com.fc.fc_spring.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController // ㅎㅐ당 class는 rest api 처리하는 controller
@RequestMapping("/api") //Request Mapping URI를 지정해주는 Annotation
public class ApiController {
    @GetMapping("/hello")
    public String hello() {
        return "hello spring boot";

    }

    // Text
    @GetMapping("/text")
    public String text(@RequestParam String account) {
        return account;

    }

    //Post Mapping
    // Request > object mapper > object > method > object > object mapper > json > response
    @PostMapping("/user")
    public User json(@RequestBody User user) {
        return user;

    }

    @PutMapping("/put")
    public ResponseEntity<User> put(@RequestBody User user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(user);

    }

}
