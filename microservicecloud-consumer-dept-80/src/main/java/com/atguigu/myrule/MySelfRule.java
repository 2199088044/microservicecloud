package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*
 * 优先级问题:
 * 我在ConfigBean中配置了Random,在MySelfRuleRoundRobinRule,
 * 最终结果是RoundRobinRule,说明同时配置时自我配置的优先级较高?
 * */

@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule() {
        return new RandomRule();//Ribbon默认是轮询，我自定义为随机
    }
}
