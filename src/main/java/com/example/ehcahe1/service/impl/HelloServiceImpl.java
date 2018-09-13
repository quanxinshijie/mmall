package com.example.ehcahe1.service.impl;

import com.example.ehcahe1.service.HelloService;
import com.example.ehcahe1.utils.EhCacheUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private EhCacheUtil ehCacheUtil;

    @Override
    public void setValue(String key, String value) {
        ehCacheUtil.setValue(key,value);
    }

    @Override
    public String getValue(String key) {
        Object value = ehCacheUtil.getValue(key);
        if (value == null){
            return "缓存中没有该值";
        }
        return (String) value;
    }

    //从缓存中删除key
    public void removeKey(String key) {
        ehCacheUtil.removeKey(key);
    }

}
