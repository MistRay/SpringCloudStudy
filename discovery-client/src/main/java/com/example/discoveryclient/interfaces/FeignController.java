package com.example.discoveryclient.interfaces;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MistLight
 * @create 2018-04-09 15:21
 * @desc Test-Feign
 */
@RestController
@RequestMapping("/testfeign")
public class FeignController {

    @Value("${test.in}")
    private String testIn;

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String testMethod(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
        return a + b + "";
    }

    @RequestMapping(value = "in", method = RequestMethod.GET)
    public String testIn(){
        return testIn;
    }
}