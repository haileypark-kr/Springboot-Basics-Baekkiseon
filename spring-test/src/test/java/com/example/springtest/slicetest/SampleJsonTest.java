package com.example.springtest.slicetest;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.json.JsonContent;

import com.example.springtest.SampleResponseDto;

@JsonTest
public class SampleJsonTest {

	@Autowired
	JacksonTester<SampleResponseDto> json;

	@Test
	public void test1() throws Exception {
		SampleResponseDto sampleResponseDto = new SampleResponseDto();
		sampleResponseDto.setName("박수현");
		sampleResponseDto.setAge(27);

		JsonContent<SampleResponseDto> content = json.write(sampleResponseDto);
		assertThat(content).hasJsonPathValue("@.name");
		assertThat(content).doesNotHaveJsonPath("@.address");
	}
}
