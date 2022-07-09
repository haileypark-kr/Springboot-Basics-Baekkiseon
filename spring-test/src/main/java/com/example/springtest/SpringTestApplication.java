package com.example.springtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringTestApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(SpringTestApplication.class);
		application.setWebApplicationType(WebApplicationType.SERVLET);
		application.run(args);
	}

}
