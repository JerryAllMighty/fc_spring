package com.fc.fc_spring.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequest {


    private String name;
    private String email;
    private Integer age;

    @Override
    public String toString(){
        return "UserRequest{" + "name='" + name + '\''
                + ", email='" + email + '\''
                + ", age='" + age + "'}";

    }
}
