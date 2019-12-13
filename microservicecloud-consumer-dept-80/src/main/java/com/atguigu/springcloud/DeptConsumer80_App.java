package com.atguigu.springcloud;

import com.atguigu.myrule.MySelfRule;
import com.atguigu.myrule.RandomRule_ZY;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;


@SpringBootApplication
@EnableEurekaClient
//在启动该微服务的时候就能去加载我们的自定义Ribbon配置类，从而使配置生效，如使用RandomRule_ZY类中的策略：
@RibbonClient(name = "MICROSERVICECLOUD-DEPT", configuration = RandomRule_ZY.class)
public class DeptConsumer80_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_App.class, args);
    }
}