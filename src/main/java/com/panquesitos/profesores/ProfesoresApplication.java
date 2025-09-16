package com.panquesitos.profesores;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.ReactiveAdapterRegistry;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
public class ProfesoresApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfesoresApplication.class, args);
		System.out.println("Hola Mundo");
	}


}
