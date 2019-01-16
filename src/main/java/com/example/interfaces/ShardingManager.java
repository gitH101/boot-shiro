package com.example.interfaces;

import com.example.entity.TOrder;
import com.example.entity.UserInfo;

import java.util.Date;
import java.util.List;

public interface ShardingManager {
    void insertUser(Long id);

    UserInfo getUset(Long id);

    void insertOrder(Long userId);

    List<TOrder> getOrdersByTime(Date begin, Date end, Long userId);
}
