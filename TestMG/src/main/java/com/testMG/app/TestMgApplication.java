package com.testMG.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.testMG.control"})
@ComponentScan({"com.testMG.rest"})
public class TestMgApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestMgApplication.class, args);
	}

}
