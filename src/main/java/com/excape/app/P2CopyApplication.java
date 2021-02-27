package com.excape.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.excape") // Annotation to provide location for packages
@EnableJpaRepositories("com.excape.repositories") // Annotation specifically for Repo resource location
@EntityScan("com.excape.beans") // Annotation to tell it where our entities are
public class P2CopyApplication {

	public static void main(String[] args) {
		SpringApplication.run(P2CopyApplication.class, args);
	}
	
		
}
