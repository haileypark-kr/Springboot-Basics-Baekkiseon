package com.example.springapplicationpart1;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleCommandLineRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		Arrays.stream(args).forEach(System.out::println); // --bar 가 찍힘
	}
}
