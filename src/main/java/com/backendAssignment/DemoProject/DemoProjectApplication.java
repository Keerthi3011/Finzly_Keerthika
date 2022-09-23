package com.backendAssignment.DemoProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.backendAssignment")
public class DemoProjectApplication{

	public static void main(String[] args) {
		SpringApplication.run(DemoProjectApplication.class, args);
	}
}