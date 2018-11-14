package com.example.interfaces;

import com.example.entity.UserInfo;

import java.util.List;

public interface UserInterface {

    List<UserInfo> getUserInfos(String userCode);
}
