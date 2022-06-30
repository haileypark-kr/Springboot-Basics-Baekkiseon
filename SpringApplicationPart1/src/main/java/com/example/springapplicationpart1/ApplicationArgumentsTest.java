package com.example.springapplicationpart1;

import org.springframework.boot.ApplicationArguments;

// @Component
public class ApplicationArgumentsTest {

	public ApplicationArgumentsTest(ApplicationArguments arguments) {
		System.out.println("foo: " + arguments.containsOption("foo")); // false
		System.out.println("bar: " + arguments.containsOption("bar")); // bar
	}
}
