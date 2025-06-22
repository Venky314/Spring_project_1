package com.example.Goodreads;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GoodreadsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoodreadsApplication.class, args);
		
		System.out.println("the server has been running");
	}

}
