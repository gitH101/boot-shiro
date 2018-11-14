package com.example;

import com.alibaba.dubbo.config.ConsumerConfig;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableDubboConfiguration
@MapperScan("com.jumstc.ops.console.mapper")
@EnableTransactionManagement
public class BootShiroApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(BootShiroApplication.class, args);
        ConsumerConfig consumerConfig = ctx.getBean(ConsumerConfig.class);
        if (null != consumerConfig) {
            consumerConfig.setCheck(false);
            consumerConfig.setRetries(0);
            consumerConfig.setTimeout(4000);
        }
    }
}
