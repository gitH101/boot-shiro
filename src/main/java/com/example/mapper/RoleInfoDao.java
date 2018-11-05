package com.example.mapper;

import com.example.common.MyMapper;
import com.example.entity.RoleInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface RoleInfoDao extends MyMapper<RoleInfo> {

    List<RoleInfo> queryRoleByUser(String userCode);
}
