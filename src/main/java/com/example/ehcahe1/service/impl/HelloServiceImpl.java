package com.example.ehcahe1.service.impl;

import com.example.ehcahe1.service.HelloService;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @CachePut(value = "users", key = "#key")
    @Override
    public String setValue(String key, String value) {

        return value;

    }

    @Cacheable(value = "users", key = "#key")
    @Override
    public String getValue(String key) {
        return "sdfsf";
    }
}
