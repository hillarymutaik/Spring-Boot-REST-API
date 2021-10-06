package com.comulynx.wallet.rest.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class Application {
	//FIXME : Add Spring boot Dev Tools in the pom.xml file
	//FIXME : Add h2 database in the pom.xml file
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
