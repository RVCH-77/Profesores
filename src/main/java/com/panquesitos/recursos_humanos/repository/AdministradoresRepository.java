package com.panquesitos.recursos_humanos.repository;
import com.panquesitos.recursos_humanos.model.Administradores;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministradoresRepository extends JpaRepository <Administradores, Long> {

    // Login
    Administradores findByCorreoAndContrasena(String correo, String contrasena);

    // Buscar por correo
    Administradores findByCorreo(String correo);

    // Buscar por id
    Administradores findById(long id);

    // Buscar por nombre
    Administradores findByNombre(String nombre);





}
