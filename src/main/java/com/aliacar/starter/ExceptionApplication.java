package com.aliacar.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = {"com.aliacar"})
@EnableJpaRepositories(basePackages = {"com.aliacar"})
@ComponentScan(basePackages = {"com.aliacar"})
@SpringBootApplication
public class ExceptionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExceptionApplication.class, args);
	}

}
