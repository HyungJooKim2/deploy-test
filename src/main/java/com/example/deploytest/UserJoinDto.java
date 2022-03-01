package com.example.deploytest;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.beans.ConstructorProperties;

@Getter
@Setter
public class UserJoinDto {
    private String usrId;

    @ConstructorProperties({"usrId"})
    public UserJoinDto(String usrId) {
        this.usrId = usrId;
    }
}
