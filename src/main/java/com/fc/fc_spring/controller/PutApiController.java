package com.fc.fc_spring.controller;

import com.fc.fc_spring.dto.PostRequestDto;
import com.fc.fc_spring.dto.PutRequestDto;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apit")
public class PutApiController {

    @PutMapping("/put")
    public void put(@RequestBody PutRequestDto putRequestDto){


    }

}
