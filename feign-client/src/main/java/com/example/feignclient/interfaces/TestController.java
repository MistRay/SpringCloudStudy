package com.example.feignclient.interfaces;

import com.example.feignclient.clients.TestFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MistLight
 * @create 2018-04-09 14:53
 * @desc TestController
 */
@RestController
@RequestMapping("/testcontroller")
public class TestController {

    @Autowired
    TestFeignClient testFeignClient;
    /**
     * Feign测试方法
     *
     * @return 返回参数
     */
    @RequestMapping("/test")
    public String TestMethod() {
        String testMethod = testFeignClient.testMethod(25,20);
        return testMethod;

    }


}
