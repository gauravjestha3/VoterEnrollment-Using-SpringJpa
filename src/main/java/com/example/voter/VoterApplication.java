package com.example.voter;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import it.ozimov.springboot.mail.configuration.EnableEmailTools;
@EnableEmailTools
@SpringBootApplication
public class VoterApplication {

	public static void main(String[] args) {
		SpringApplication.run(VoterApplication.class, args);
	}

	@Bean
	ModelMapper mapper() {
		return new ModelMapper();
	}
}
