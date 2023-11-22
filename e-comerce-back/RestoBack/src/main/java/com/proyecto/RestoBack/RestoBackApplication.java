package com.proyecto.RestoBack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
/*(exclude={SecurityAutoConfiguration.class})*/
public class RestoBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestoBackApplication.class, args);
	}

}
