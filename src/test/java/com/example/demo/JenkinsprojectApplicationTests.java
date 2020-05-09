package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class JenkinsprojectApplicationTests {

	
	
	
	
	public static org.slf4j.Logger logger = LoggerFactory.getLogger(JenkinsprojectApplication.class);
	@Test
	void contextLoads() {
		logger.info("Test case excuting....");
		assertEquals(true,true);
	}

}
