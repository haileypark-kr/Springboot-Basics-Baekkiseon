package com.example.externalsettings;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@TestPropertySource(locations = "classpath:/test.properties")
@SpringBootTest
public class PropertySourceTest {
	
	@Value("${soohyun.age}")
	private int age;

	@Test
	public void test1() throws Exception {
		System.out.println(age);
	}
}
