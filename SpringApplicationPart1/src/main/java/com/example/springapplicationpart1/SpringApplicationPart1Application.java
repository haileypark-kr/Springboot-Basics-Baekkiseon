package com.example.springapplicationpart1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringApplicationPart1Application {

	public static void main(String[] args) {
		// SpringApplication.run(Application.class, args); // ==> 이렇게 쓰면 springboot의 다양한 기능 사용 불가

		// 아래 방법으로 run 하기. 위와 동일. 이게 커스터마이징하기 더 좋음.
		SpringApplication application = new SpringApplication(SpringApplicationPart1Application.class);
		application.run(args);

		// Builder 패턴으로 run 할 수도 있음.
		// new SpringApplicationBuilder()
		// 	.sources(SpringApplicationPart1Application.class)
		// 	.bannerMode(Banner.Mode.OFF)
		// 	.run(args);
	}

}
