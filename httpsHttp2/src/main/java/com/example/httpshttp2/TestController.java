package com.example.httpshttp2;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/test")
	@ResponseStatus(HttpStatus.OK)
	public String test() {
		return "Success";
	}
}
