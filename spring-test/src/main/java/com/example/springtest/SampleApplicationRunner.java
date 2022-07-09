package com.example.springtest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleApplicationRunner implements ApplicationRunner {

	private Logger LOGGER = LogManager.getLogger(this.getClass());
	private final UserProperties userProperties;

	public SampleApplicationRunner(UserProperties userProperties) {
		this.userProperties = userProperties;
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		LOGGER.debug("#### logging test ####");
		LOGGER.debug(args.containsOption("soo"));
		LOGGER.debug("name: {}", userProperties.getName());
		LOGGER.debug("age: {}", userProperties.getAge());
		LOGGER.debug("timeout ms: {}", userProperties.getSessionTimeout().toMillis());

		LOGGER.debug("#### logging test ####");
	}
}
