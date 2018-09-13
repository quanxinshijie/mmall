package com.example.ehcahe1.service;

public interface HelloService {
    void setValue(String key, String value);

    String getValue(String key);

    void removeKey(String key);
}
