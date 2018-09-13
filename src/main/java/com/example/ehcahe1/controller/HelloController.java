package com.example.ehcahe1.controller;

import com.example.ehcahe1.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;
    @GetMapping("setValue")
    public void setValue(String key,String value){
        helloService.setValue(key,value);

    }

    @GetMapping("getValue")
    public String getValue(String key){
        String value = helloService.getValue(key);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>"+value);
        return value;
    }


}
