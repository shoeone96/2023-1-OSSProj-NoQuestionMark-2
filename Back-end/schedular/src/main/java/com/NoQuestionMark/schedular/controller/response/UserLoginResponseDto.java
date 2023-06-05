package com.NoQuestionMark.schedular.controller.response;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public class UserLoginResponseDto {
    private String token;
    private String userName;
    private String schoolNumber;
    private String userType;

}
