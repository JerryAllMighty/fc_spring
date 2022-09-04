package com.fc.fc_spring.controller;

import com.fc.fc_spring.dto.User;
import lombok.var;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @RequestMapping("/main")
    public String main() {
        return "main.html";

    }


    @ResponseBody()
    @GetMapping("/user")
    public User user() {
        var user = new User();
        user.setName("steve");
        user.setAddress("seoul city");
        return user;
    }
}
