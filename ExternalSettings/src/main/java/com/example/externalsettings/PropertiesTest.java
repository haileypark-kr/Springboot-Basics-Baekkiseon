package com.example.externalsettings;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertiesTest {

	@Value("${soohyun.park}")
	private String soo;
	
	@Value("${soohyun.age}")
	private int age;

	@PostConstruct
	public void test() {
		System.out.println(soo);
		System.out.println(age);
	}
}
