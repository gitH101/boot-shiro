package com.example.vo;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class UserInfoVo {

    @NotBlank(message = "用户名不能为空")
    private String userCode;

    @NotBlank(message = "密码不能为空")
    private String userPwd;
}
