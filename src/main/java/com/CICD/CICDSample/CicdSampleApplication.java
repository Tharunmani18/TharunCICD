package com.CICD.CICDSample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CicdSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicdSampleApplication.class, args);

		System.out.println("Welcome to CICD");
	}

}
