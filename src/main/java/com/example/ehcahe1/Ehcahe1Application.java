package com.example.ehcahe1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Ehcahe1Application {

	public static void main(String[] args) {
		SpringApplication.run(Ehcahe1Application.class, args);
	}
}
