/*
package com.example.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONObject;
import com.jumstc.ops.api.jzzd.entity.Result;
import com.jumstc.ops.api.jzzd.entity.SignInfo;
import com.jumstc.ops.api.jzzd.interfaces.OperationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OperationServiceTest {

    @Reference(version = "1.0",group = "com.jumstc.ops")
    OperationService operationService;

    @Test
    public void testSignInfo(){
        Result<SignInfo> result = operationService.signFor("7778889");
        System.out.println("result:" + JSONObject.toJSONString(result));
    }
}
*/
