package com.example.mapper;

import com.example.common.MyMapper;
import com.example.entity.UserRoleR;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserRoleRDao extends MyMapper<UserRoleR> {

    List<String> queryRoleByUser(String userCode);
}
