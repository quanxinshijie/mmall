package com.example.ehcahe1;

import com.example.ehcahe1.utils.EhCacheUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableCaching
public class Ehcahe1Application {

	@Bean
	public EhCacheUtil ehCacheUtil(){
		return new EhCacheUtil();
	}

	public static void main(String[] args) {
		SpringApplication.run(Ehcahe1Application.class, args);
	}
}
