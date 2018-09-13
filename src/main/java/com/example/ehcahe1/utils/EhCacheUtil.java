package com.example.ehcahe1.utils;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

public class EhCacheUtil<Object> {

    //与@Cacheable不同，@CachePut不仅会缓存方法的结果，还会执行方法的代码段。
    @CachePut(value = "users", key = "#key")
    public Object setValue(String key, Object value){
        return value;
    }

    //表明所修饰的方法是可以缓存的：当第一次调用这个方法时，
    // 它的结果会被缓存下来，在缓存的有效时间内，
    // 以后访问这个方法都直接返回缓存结果，不再执行方法中的代码段
    @Cacheable(value = "users", key = "#key")
    public Object getValue(String key) {
        //缓存中查不到会返回null
        return null;
    }

    //从缓存中删除key
    @CacheEvict(value = "users", key = "#key")
    public void removeKey(String key) {
    }


}
