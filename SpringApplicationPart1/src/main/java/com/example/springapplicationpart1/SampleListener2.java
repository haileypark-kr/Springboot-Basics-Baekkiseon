package com.example.springapplicationpart1;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

// @Component // bean으로만 등록해주면 알아서 들어감.
public class SampleListener2 implements ApplicationListener<ApplicationStartedEvent> {

	@Override
	public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {

		System.out.println("======= Application started =======");

	}
}
