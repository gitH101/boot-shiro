package com.example.mapper;

import com.example.entity.UserInfo;
import com.example.common.MyMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserInfoDao extends MyMapper<UserInfo> {
}
