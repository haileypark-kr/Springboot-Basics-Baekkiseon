package com.example.springtest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	Logger LOG = LoggerFactory.getLogger(this.getClass());

	private final TestService testService;

	public TestController(TestService testService) {
		this.testService = testService;
	}

	@GetMapping("/hello")
	public String hello() {
		LOG.info("outputcapture");
		System.out.println("OUTPUTCAPTURE"); // OutputCapture로 sout도 캡쳐 됨.
		return "hello " + testService.getName();
	}
}
