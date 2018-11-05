package com.example;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableDubboConfiguration
@MapperScan("com.jumstc.ops.console.mapper")
@EnableTransactionManagement
public class OpsConsoleApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpsConsoleApplication.class, args);
    }
}
