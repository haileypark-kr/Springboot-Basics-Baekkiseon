package com.example.springtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

	@Autowired
	private UserProperties userProperties;

	public String getName() {
		return userProperties.getName();
	}
}
