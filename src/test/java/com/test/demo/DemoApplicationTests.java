package com.test.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		Calculator calculator = new Calculator();
		int result = calculator.sum(10, 5);
		assertEquals(result, 15);
	}

}
