package com.example.sportshop;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {BasketServiceTest.class, CustomUserDetailsServiceTest.class, ProductServiceTest.class, UserServiceTest.class} )
class SportshopApplicationTests {

	@Test
	void contextLoads() {
	}

}
