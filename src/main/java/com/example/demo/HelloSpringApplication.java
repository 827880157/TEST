package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		System.out.println("Hel Spring");
		SpringApplication.run(HelloSpringApplication.class, args);
		
	}

}
