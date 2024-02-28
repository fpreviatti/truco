package com.truco;

import com.fasterxml.jackson.datatype.guava.GuavaModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TrucoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrucoApplication.class, args);
	}

	@Bean
	public GuavaModule guavaModule() {
		return new GuavaModule();
	}

}
