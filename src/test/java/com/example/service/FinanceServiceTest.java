/*
package com.example.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONObject;
import com.jumstc.ops.api.jzzd.entity.PsFeeRequest;
import com.jumstc.ops.api.jzzd.entity.Result;
import com.jumstc.ops.api.jzzd.interfaces.FinanceService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FinanceServiceTest {

    private static final Logger logger = LoggerFactory.getLogger(FinanceServiceTest.class);

    @Reference(version = "1.0",group = "com.jumstc.ops")
    private FinanceService financeService;

    @Test
    public void testQueryPsFee() {
        PsFeeRequest psFeeRequest = new PsFeeRequest();
        psFeeRequest.setSiteId("e60b4de13ead47cca193b9e7a9d16858");
        psFeeRequest.setPieces(3);
        psFeeRequest.setPsAddr("江苏省--扬州市--江都区");
        psFeeRequest.setServiceType("51101");
        psFeeRequest.setVolume(new BigDecimal(23));
        psFeeRequest.setWeight(new BigDecimal(23));
        Result result = financeService.getPSFee(psFeeRequest);
        System.out.println("result:" + JSONObject.toJSONString(result));

    }
}
*/
