package com.example.springtest;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;
import org.springframework.test.web.servlet.MockMvc;

@ExtendWith(OutputCaptureExtension.class)
@WebMvcTest(controllers = TestController.class)
public class SampleOutputCaptureTest {

	@Autowired
	MockMvc mockMvc;

	@MockBean
	TestService mockTestService;

	@Test
	public void ouputCaptureTest(CapturedOutput capturedOutput) throws Exception {
		String tempName = "soohyunTest";
		when(mockTestService.getName()).thenReturn(tempName);

		mockMvc.perform(get("/hello"))
			.andExpect(status().isOk())
			.andExpect(content().string("hello " + tempName))
			.andDo(print());

		assertThat(capturedOutput.toString())
			.contains("outputcapture")
			.contains("OUTPUTCAPTURE");
	}
}
