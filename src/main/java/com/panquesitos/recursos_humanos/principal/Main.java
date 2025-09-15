package com.panquesitos.recursos_humanos.principal;

import  com.panquesitos.recursos_humanos.model.Profesor;
import  com.panquesitos.recursos_humanos.repository.ProfesorRepository;
import  com.panquesitos.recursos_humanos.service.ProfesorService;
import   com.panquesitos.recursos_humanos.controllador.ControllerPorfesor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.panquesitos.recursos_humanos")
@EntityScan("com.panquesitos.recursos_humanos.model") // paquete de tus entidades
@EnableJpaRepositories("com.panquesitos.recursos_humanos.repository") // paquete de repositorios
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
