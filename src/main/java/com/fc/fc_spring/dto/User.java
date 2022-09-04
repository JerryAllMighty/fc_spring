package com.fc.fc_spring.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class)
// not null인 것만 보여주겠다는 뜻
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {
    private String name;
    // int로 했을 시 값이 없을 때 0으로, integet일 때는 값이 없을 때 null
    private Integer age;

    // request에서 model mapping시에, 그리고 return시 json형태로 바꿀 시에 명시해주는 역할
    @JsonProperty("phone_number")
    private String phoneNumber;
    private String address;

    // objectMapper 에서 text > object 매핑시 활용
    public User(){}

    public User(String name, int age){
        this.name = name;
        this.age = age;


    }

}
