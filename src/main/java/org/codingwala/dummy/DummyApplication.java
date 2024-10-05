package org.codingwala.dummy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DummyApplication {

	public static void main(String[] args) {
		MyController.myMethod();
		SpringApplication.run(DummyApplication.class, args);
		System.out.println("Hello World!");
	}

}
