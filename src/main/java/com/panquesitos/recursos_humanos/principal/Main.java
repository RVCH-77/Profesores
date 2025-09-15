package com.panquesitos.recursos_humanos.principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.panquesitos.recursos_humanos.model") // paquete de tus entidades
@EnableJpaRepositories("com.panquesitos.recursos_humanos.repository") // paquete de repositorios
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
