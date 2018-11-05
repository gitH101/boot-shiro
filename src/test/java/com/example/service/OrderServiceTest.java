/*
package com.example.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONObject;
import com.jumstc.ops.api.jzzd.entity.BoxInfo;
import com.jumstc.ops.api.jzzd.entity.Order;
import com.jumstc.ops.api.jzzd.entity.Result;
import com.jumstc.ops.api.jzzd.entity.basedata.BoleUser;
import com.jumstc.ops.api.jzzd.interfaces.OrderService;
import lombok.extern.java.Log;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceTest {

    @Reference(version = "1.0",group = "com.jumstc.ops")
    private OrderService orderServiceImpl;

    @Test
    public void testSave() throws Exception {
        List<Order> orderList = new ArrayList<>();
        Order order = new Order();
        order.setCustomerName("京东商城");
        order.setGoodsName("笔记本");
//        order.setOperateName("孙悟空");
        order.setRemarks("三打白骨精");
        order.setPieces(2);
        order.setWeight(new BigDecimal(22));
        order.setVolume(new BigDecimal(22));
        order.setServiceType("51101");
        order.setOrderNo("778850");


        order.setStartAddr("浙江省--宁波市--镇海区");
        order.setEndAddr("河南省--新乡市--红旗区");
        orderList.add(order);
        BoxInfo boxInfo = new BoxInfo();
        boxInfo.setBoxId("9999999");
        boxInfo.setNextSationid("71c023650c8d4947882c7e261fd5baca");
        boxInfo.setNextSationname("测试园区");
//        SendCarInfo sendCarInfo = new SendCarInfo();
        BoleUser boleUser = new BoleUser();
        boleUser.setCompanyId("d2d1f2c269f340ac83ddeca92ba0b969");
        boleUser.setCompanyName("chh3");
        boleUser.setId("1ea6f2c2489f42c0b38a970ae1c5a2a5");
        boleUser.setName("无痕发货");
        Result result = orderServiceImpl.save(orderList, boxInfo, boleUser);
        System.out.println("result:" + JSONObject.toJSONString(result));
    }


    @Test
    public void testGetOrder() throws Exception {
        Result result = orderServiceImpl.getOrderStatus("778850","0");
        System.out.println("result:" + JSONObject.toJSONString(result));
    }
}*/
