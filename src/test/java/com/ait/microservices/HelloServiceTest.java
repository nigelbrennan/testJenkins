package com.ait.microservices;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HelloServiceTest {
	
	HelloService helloService;

	@BeforeEach
	public void setUp() throws Exception {
		helloService = new HelloService();
	}

	@Test
	public void test() {
		assertEquals("Hello World 2023...", helloService.index());
	}

}
