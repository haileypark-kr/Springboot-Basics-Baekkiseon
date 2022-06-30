package com.example.springapplicationpart1;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

// springboot에서 제공하는 application 리스너
// @Component // ApplicationStartingEvent 는 application context 생성 전에 발생하는 이벤트라서 bean으로 등록하면 실행 안됨. bean 빼야됨.
public class SampleListener implements ApplicationListener<ApplicationStartingEvent> {

	@Override
	public void onApplicationEvent(ApplicationStartingEvent applicationStartingEvent) {

		System.out.println("======= Application is starting =======");

	}
}
