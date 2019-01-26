package com.spaceN.needsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.spaceN.needsapp.controller")
public class NeedsAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(NeedsAppApplication.class, args);
	}

}

