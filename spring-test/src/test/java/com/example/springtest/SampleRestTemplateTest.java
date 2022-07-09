package com.example.springtest;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SampleRestTemplateTest {

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Autowired
	private WebTestClient webTestClient; // webflux 테스트

	@Autowired
	private UserProperties properties;

	@MockBean
	private TestService mockTestService;

	@Test
	public void restTemplateTest() throws Exception {
		String result = testRestTemplate.getForObject("/hello", String.class);
		assertThat(result).isEqualTo("hello " + properties.getName());

	}

	@Test
	public void mockBeanTest() throws Exception {
		String tempName = "soohyunTest";
		when(mockTestService.getName()).thenReturn(tempName);

		String result = testRestTemplate.getForObject("/hello", String.class);
		assertThat(result).isEqualTo("hello " + tempName);
	}

	@Test
	public void webTestClientTest() throws Exception {
		String tempName = "soohyunTest";
		when(mockTestService.getName()).thenReturn(tempName);

		webTestClient.get().uri("/hello").exchange()
			.expectStatus().isOk()
			.expectBody(String.class)
			.isEqualTo("hello " + tempName);

	}
}
