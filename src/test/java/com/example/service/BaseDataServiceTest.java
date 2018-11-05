/*
package com.example.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONObject;
import com.jumstc.ops.api.jzzd.entity.basedata.DispatchInfo;
import com.jumstc.ops.api.jzzd.entity.Result;
import com.jumstc.ops.api.jzzd.entity.basedata.Org;
import com.jumstc.ops.api.jzzd.entity.basedata.Province;
import com.jumstc.ops.api.jzzd.interfaces.BaseDataService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BaseDataServiceTest {

    @Reference(version = "1.0",group = "com.jumstc.ops")
    BaseDataService baseDataService;

//    @Test
//    public void testListOrgsById(){
//        Result<List<DispatchInfo>> result = baseDataService.listOrgsById("广东省--广州市--白云区");
//        System.out.println("result:" + JSONObject.toJSONString(result));
//    }

    @Test
    public void testlistAllOrgs(){
        Result<List<Org>> result = baseDataService.listAllOrgs();
        System.out.println("result:" + JSONObject.toJSONString(result));
    }

    @Test
    public void testSelectLocation(){
        Result<List<Province>> result = baseDataService.selectByLocation();
        System.out.println("result:" + JSONObject.toJSONString(result));
    }
}
*/
