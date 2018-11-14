package com.example.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.interfaces.UserInterface;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class DubboTest {

    @Reference
    private UserInterface userInterface;

    @Test
    public void testDubbo(){
      log.info("result: {}", userInterface.getUserInfos("admin"));
    }
}
