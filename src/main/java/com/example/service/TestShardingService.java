package com.example.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.entity.TOrder;
import com.example.entity.UserInfo;
import com.example.interfaces.ShardingManager;
import com.example.mapper.TOrderDao;
import com.example.mapper.UserInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

@Service(group = "${example.group}", version = "${example.version}")
public class TestShardingService implements ShardingManager {

    @Autowired
    private UserInfoDao userInfoDao;

    @Autowired
    private TOrderDao tOrderDao;

    @Override
    public void insertUser(Long id){
        UserInfo userInfo = new UserInfo();
        userInfo.setId(id);
        userInfo.setUserCode("123");
        userInfo.setUserName("测试");
        userInfoDao.insertSelective(userInfo);
    }

    @Override
    public UserInfo getUset(Long id){
        UserInfo userInfo = new UserInfo();
        userInfo.setId(id);
        return userInfoDao.selectByPrimaryKey(userInfo);
    }

    @Override
    public void insertOrder(Long userId){
        TOrder order = new TOrder();
        order.setCreateTime(new Date());
        order.setInfo("xxx");
        order.setUserId(userId);
        tOrderDao.insertSelective(order);
    }

    @Override
    public List<TOrder> getOrdersByTime(Date begin, Date end, Long userId){
        Example example = new Example(TOrder.class);
        example.createCriteria().andBetween("createTime", begin, end).andEqualTo("userId", userId);
        return tOrderDao.selectByExample(example);
    }

}
