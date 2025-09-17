package com.panquesitos.recursos_humanos.repository;

import com.panquesitos.recursos_humanos.model.Administradores;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdministradoresRepository extends JpaRepository<Administradores, Long> {

    // Login
    Administradores findByCorreoAndContrasena(String correo, String contrasena);

    // Buscar por correo
    Administradores findByCorreo(String correo);

    // Buscar por nombre (puede haber varios con el mismo nombre)
    List<Administradores> findByNombre(String nombre);

    //listar todos los administradores
    List<Administradores> getAllProfesores();
}
