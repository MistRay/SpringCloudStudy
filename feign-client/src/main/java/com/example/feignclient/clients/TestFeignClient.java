package com.example.feignclient.clients;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name  = "discovery-client")
public interface TestFeignClient {
    /**
     * 测试feign
     * @return 返回一个字符串
     */
    @RequestMapping(value = "/testfeign/test",method = RequestMethod.GET)
    String testMethod(@RequestParam("a") Integer a , @RequestParam("b") Integer b);
}
