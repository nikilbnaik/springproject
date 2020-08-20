package com.example.springproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringprojeactApplication extends SpringBootServletInitializer {

	
	public static void main(String[] args) {
		SpringApplication.run(SpringprojeactApplication.class, args);
		System.out.println("Application Running");
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringprojeactApplication.class);
	}
}
