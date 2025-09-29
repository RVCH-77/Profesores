package com.panquesitos.profesores.principal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") // todos los endpoints
                        .allowedOrigins("http://localhost:3000", "http://localhost:3001",
                                "http://localhost:3002", "http://localhost:3003", "http://localhost:3004",
                                "http://localhost:3005") // frontend
                        .allowedMethods("GET", "POST", "PUT", "DELETE") // métodos permitidos
                        .allowCredentials(true);
            }
        };
    }
}
