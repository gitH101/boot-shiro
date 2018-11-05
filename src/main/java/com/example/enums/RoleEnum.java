package com.example.enums;

import lombok.Getter;

public enum  RoleEnum {

    ADMIN("admin","管理员"),GUEST("guest","访客");

    @Getter
    private String code;

    @Getter
    private String name;

    private RoleEnum(String code, String name){
        this.code = code;
        this.name = name;
    }
}
