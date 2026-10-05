package com.example.simple_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SimpleSpringbootApplication {

	public static void main(String[] args) {
		 //run method creates an application context and starts the Spring Boot application
		SpringApplication.run(SimpleSpringbootApplication.class, args);
	}
	@Bean 
	public MyService myService() {
		return new MyService();
	}

}
