package com.fc.fc_spring.controller;

import com.fc.fc_spring.dto.PostRequestDto;
import com.fc.fc_spring.dto.PutRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutApiController {

    @PutMapping("/put/{userId}")
    public PutRequestDto put(@RequestBody PutRequestDto putRequestDto, @PathVariable(name="userId") Long id){
        System.out.println(id);
        System.out.println(putRequestDto);
        return putRequestDto;
    }

}
