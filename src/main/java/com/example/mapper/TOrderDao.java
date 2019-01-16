package com.example.mapper;

import com.example.common.MyMapper;
import com.example.entity.TOrder;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TOrderDao extends MyMapper<TOrder> {
}
