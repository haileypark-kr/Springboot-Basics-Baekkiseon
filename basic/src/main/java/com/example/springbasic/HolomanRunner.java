package com.example.springbasic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.soospringbootstarter.Holoman;

@Component
public class HolomanRunner implements ApplicationRunner { // argument를 받아서 돌리고 싶을 때 ApplicationRunner 사용

	@Autowired
	Holoman holoman;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(holoman);
	}
}

