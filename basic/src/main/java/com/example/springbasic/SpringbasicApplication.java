package com.example.springbasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @SpringBootConfiguration // @Configuration과 비슷
public class SpringbasicApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(SpringbasicApplication.class);
		application.setWebApplicationType(WebApplicationType.NONE); // NONE이면 웹서버 안띄움
		application.run(args);
	}

	/**
	 * HolomanRunner에서 AutoConfigure로 holoman bean을 등록한 Bean에 의해 overwrite된다.
	 * (ComponentScan한 bean이 overwrite됨)
	 * ==> HolomanConfiguration에서 @ConditionalOnMissingBean 추가.
	 * 값을 동적으로 바꾸기 위해서는 HolomanConfiguration에서 ConfigurationProperties 설정 추가
	 */
	// @Bean
	// public Holoman holoman() {
	// 	Holoman holoman = new Holoman();
	// 	holoman.setName("박수현");
	// 	holoman.setHowLog(60);
	// 	return holoman;
	// }
}
