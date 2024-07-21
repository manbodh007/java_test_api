package com.test.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		Calculator calculator = new Calculator();
		int result = calculator.sum(10, 5);
		System.out.println(result != 15 ? "wrong answer" : "accepted");
	}

}
