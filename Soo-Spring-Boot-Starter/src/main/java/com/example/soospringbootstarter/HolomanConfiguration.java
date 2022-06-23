package com.example.soospringbootstarter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(HolomanProperties.class) // HolomanProperties를 참조해서 값을 가져와서 아래 bean에 넣는다.
public class HolomanConfiguration {

	@Bean
	@ConditionalOnMissingBean // 아래 bean 이미 있으면 등록하지 마라.
	public Holoman holoman(HolomanProperties properties) {
		Holoman holoman = new Holoman();
		holoman.setName(properties.getName());
		holoman.setHowLog(properties.getHowLong());

		return holoman;
	}
}
