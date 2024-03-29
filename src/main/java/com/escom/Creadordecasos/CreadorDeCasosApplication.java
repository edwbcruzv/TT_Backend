package com.escom.Creadordecasos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
//@EntityScan("com.escom.CreadordeCasos")
public class CreadorDeCasosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreadorDeCasosApplication.class, args);
	}

}
