package com.example.springtest;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Validated
@Component
@ConfigurationProperties("test.user")
public class UserProperties {

	@NotEmpty
	private String name;

	@Min(value = 1)
	private int age;

	@DurationUnit(ChronoUnit.MINUTES)
	private Duration sessionTimeout = Duration.ofMinutes(30);

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Duration getSessionTimeout() {
		return sessionTimeout;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSessionTimeout(Duration sessionTimeout) {
		this.sessionTimeout = sessionTimeout;
	}
}
