package com.example.configclient.interfaces;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MistLight
 * @create 2018-04-13 17:29
 * @desc
 */
@RestController
public class TestController {

    @Value("${foo}")
    private  String foo;

    @RequestMapping("/hello")
    public String TestMethod(){
        return foo;
    }
}
