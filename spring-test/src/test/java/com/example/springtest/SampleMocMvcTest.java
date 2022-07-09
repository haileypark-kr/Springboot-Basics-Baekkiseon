package com.example.springtest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc(printOnlyOnFailure = false) // DispatcherServlet을 mockup해서 뜬 서블릿에 요청보내려면 mockMvcClient를 써야 함.
public class SampleMocMvcTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private UserProperties properties;

	@Test
	public void test1() throws Exception {

		mockMvc.perform(get("/hello")) // get 요청
			.andExpect(status().isOk()) // status가 OK
			.andExpect(content().string("hello " + properties.getName()));
		// .andDo(print());

	}
}
