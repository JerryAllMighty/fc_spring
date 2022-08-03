package com.fc.fc_spring.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostRequestDto {
    private String account;
    private String email;
    private String address;
    private String password;

    @JsonProperty("phone_number")
    private String phoneNumber;

    @Override
    public String toString(){
        return "PostRequestDto{" + "account='" + account + '\''
                + ", email='" + email + '\''
                + ", password='" + password + '\''
                + ", phoneNumber='" + phoneNumber + '\''
                + ", address='" + address + "'}";

    }
}
