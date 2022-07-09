package com.example.springtest.slicetest;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.example.springtest.TestController;
import com.example.springtest.TestService;

@WebMvcTest(controllers = TestController.class)
public class SampleWebMvcTest {

	@Autowired
	MockMvc mockMvc;

	@MockBean
	TestService mockTestService;

	@Test
	public void webMvcTest() throws Exception {
		String tempName = "soohyunTest";

		when(mockTestService.getName()).thenReturn(tempName);

		mockMvc.perform(get("/hello"))
			.andExpect(status().isOk())
			.andExpect(content().string("hello " + tempName))
			.andDo(print());

	}

}
