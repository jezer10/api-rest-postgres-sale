package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApiresttestApplicationTests {
	Long hola=(long) 5;

	@Test
	void contextLoads() {
		System.out.println("hola como estas"+hola);
	}

}
