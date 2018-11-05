package com.example.mapper;

import com.example.entity.User;
import com.example.common.MyMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends MyMapper<User> {
}
