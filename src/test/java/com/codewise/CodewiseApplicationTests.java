package com.codewise;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class CodewiseApplicationTests {

	@Test
	void contextLoads() {
		Assert.isTrue(4 < 2, "message");
	}

}
