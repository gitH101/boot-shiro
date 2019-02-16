package com.example.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserInfoDto {

    /**
     * <pre>
     * 用户ID
     * 表字段 : cms_user_info.ID
     * </pre>
     */
    private Long id;

    /**
     * <pre>
     * 用户编码
     * 表字段 : cms_user_info.USER_CODE
     * </pre>
     */
    private String userCode;

    /**
     * <pre>
     * 用户名称
     * 表字段 : cms_user_info.USER_NAME
     * </pre>
     */
    private String userName;

    /**
     * 角色列表
     */
    private List<String> roleCodes;
}
