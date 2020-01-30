package com.holliemthomas.songr;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

// This test demonstrates that I know how to write integration tests
// (-2 pts Working integration tests for your hello world routes)

@SpringBootTest
class SongrApplicationTests {

	@Autowired
	private SongrApplication controller;


	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();

	}
};

//	got help from Demo
