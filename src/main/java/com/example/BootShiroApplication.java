package com.example;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableDubboConfig(multiple=true)
@MapperScan("com.jumstc.ops.console.mapper")
@EnableTransactionManagement
public class BootShiroApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootShiroApplication.class, args);
    }
}
