package com.example.demo;

import javax.annotation.PostConstruct;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsprojectApplication {
	
	public static org.slf4j.Logger logger = LoggerFactory.getLogger(JenkinsprojectApplication.class);
	
	
	@PostConstruct
	public void intt()
	{
		logger.info("Application started.....");
	}
	
	
	

	public static void main(String[] args) {
		logger.info("Application excuted.....");
		SpringApplication.run(JenkinsprojectApplication.class, args);
	}

}
