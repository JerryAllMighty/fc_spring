package com.fc.fc_spring.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarDto {
    public String name;
    public String carNumber;

    @Override
    public String toString(){
        return "PostRequestDto{"
                + "name='" + name + '\''
                + ", carNumber='" + carNumber + "'}";

    }
}
