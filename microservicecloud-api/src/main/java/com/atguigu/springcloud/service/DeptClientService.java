package com.atguigu.springcloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.atguigu.springcloud.entities.Dept;

//@FeignClient(value = "MICROSERVICECLOUD-DEPT")

//服务降级处理是在客户端实现完成的，与服务端没有关系
//服务降级的思想: 整体资源快不够了，忍痛将某些服务先关掉，待渡过难关，再开启回来。
//统一将DeptClientServiceFallbackFactory中异常的解决方案配置进来
@FeignClient(value = "MICROSERVICECLOUD-DEPT", fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {
    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") long id);


    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list();


    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(Dept dept);
}
          