package com.example.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONObject;
import com.example.entity.TOrder;
import com.example.interfaces.ShardingManager;
import com.example.interfaces.UserInterface;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class DubboTest {

//    @Reference
    @Autowired
    private UserInterface userInterface;

//    @Reference(group = "${example.group}", version = "#{example.version}")
    @Autowired
    private ShardingManager shardingManager;

    @Test
    public void testDubbo(){
      log.info("result: {}", userInterface.getUserInfos("admin"));
    }

    @Test
    public void testInsertUser(){
        shardingManager.insertUser();
    }

    @Test
    public void selectUser(){
        shardingManager.getUset(12L);
    }

    @Test
    public void testInsertOrder(){
        shardingManager.insertOrder(11L);
    }

    @Test
    public void testSelectOrder(){
        List<TOrder> tOrders = shardingManager.getOrdersByTime(new Date(System.currentTimeMillis() - 1000 * 60 * 60 * 12), new Date(),12L);
        System.out.println(JSONObject.toJSONString(tOrders));
    }
}
