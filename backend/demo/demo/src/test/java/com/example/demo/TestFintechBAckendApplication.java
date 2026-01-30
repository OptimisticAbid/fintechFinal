package com.example.demo;

import org.springframework.boot.SpringApplication;

public class TestFintechBAckendApplication {

	public static void main(String[] args) {
		SpringApplication.from(FintechBAckendApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
